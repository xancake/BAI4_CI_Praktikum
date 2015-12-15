package org.haw.cip.praktikum3.choco;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class ConstraintSolverSpaltenweiseMitUebertraegen {
	public static void main(String[] arg) {
		Model model = new CPModel();

		// Declare every letter as a variable
		IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
		IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
		IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
		IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
		IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
		IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
		IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
		IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
		IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
		IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
		
		// Jedes Carry als Variable anlegen
		IntegerVariable u0 = Choco.constant(0); // Kann nur 0 sein, da vorher kein Übertrag gebildet werden kann
		IntegerVariable u1 = Choco.makeIntVar("u1", 0, 1, Options.V_ENUM);
		IntegerVariable u2 = Choco.makeIntVar("u2", 0, 1, Options.V_ENUM);
		IntegerVariable u3 = Choco.makeIntVar("u3", 0, 1, Options.V_ENUM);
		IntegerVariable u4 = Choco.makeIntVar("u4", 0, 1, Options.V_ENUM);
		IntegerVariable u5 = Choco.makeIntVar("u5", 0, 1, Options.V_ENUM);
		
		// Constraint für die Letter inklusive ihrer Carries anlegen:
		//  d  o  n  a  l  d
		//  g  e  r  a  l  d
		// u5 u4 u3 u2 u1 u0
		//  =  =  =  =  =  =
		//  r  o  b  e  r  t
		// u0 u5 u4 u3 u2 u1 (immer *10, da der Übertrag für die nächste Stelle als um Faktor 10 geringer betrachtet werden muss)
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, d), u0), Choco.plus(t, Choco.mult(u1, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(l, l), u1), Choco.plus(r, Choco.mult(u2, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(a, a), u2), Choco.plus(e, Choco.mult(u3, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(n, r), u3), Choco.plus(b, Choco.mult(u4, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(o, e), u4), Choco.plus(o, Choco.mult(u5, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, g), u5), Choco.plus(r, Choco.mult(u0, 10))));
		
		// Add constraint of all different letters.
		model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));

		// Build a solver, read the model and solve it
		Solver s = new CPSolver();
		s.read(model);
		
		long start = System.currentTimeMillis();
		s.solve();
		System.out.println("Laufzeit: " + (System.currentTimeMillis() - start) + "ms");
		System.out.println("############################");
		printVariableList(s, d, o, n, a, l, d);
		printVariableList(s, g, e, r, a, l, d);
		printVariableList(s, r, o, b, e, r, t);
	}
	
	private static void printVariableList(Solver s, IntegerVariable... variables) {
		for(IntegerVariable letter : variables) {
			System.out.print(letter.getName());
		}
		System.out.print(" = ");
		for(IntegerVariable letter : variables) {
			System.out.print(s.getVar(letter).getVal() + " ");
		}
		System.out.println("");
	}
}
