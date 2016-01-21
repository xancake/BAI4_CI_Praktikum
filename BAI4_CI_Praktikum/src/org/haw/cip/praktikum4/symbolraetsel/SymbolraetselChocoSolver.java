package org.haw.cip.praktikum4.symbolraetsel;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

import java.util.List;
import java.util.ArrayList;

public class SymbolraetselChocoSolver {
	public static void main(String... args) {
		Model model = new CPModel();
		
		// Alle Buchstaben als Variable deklarieren
		IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM);
		IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM);
		IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM);
		IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM);
		IntegerVariable E = Choco.makeIntVar("E", 0, 9, Options.V_ENUM);
		IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM);
		IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM);
		IntegerVariable H = Choco.makeIntVar("H", 0, 9, Options.V_ENUM);
		IntegerVariable J = Choco.makeIntVar("J", 0, 9, Options.V_ENUM);
		IntegerVariable K = Choco.makeIntVar("K", 0, 9, Options.V_ENUM);
		
		// Hilfsvariablen fuer die Uebertraege
		int aufgabe = 1, uebertrag;
		List<IntegerVariable> u;
		
		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, B), u.get(--uebertrag)), Choco.plus(C, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, E), u.get(--uebertrag)), Choco.plus(A, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, E), u.get(--uebertrag)), Choco.plus(G, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, A), u.get(--uebertrag)), Choco.plus(G, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;

		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, Choco.ZERO), u.get(--uebertrag)), Choco.plus(C, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(A, J), u.get(--uebertrag)), Choco.plus(K, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(H, D), u.get(--uebertrag)), Choco.plus(A, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, K), u.get(--uebertrag)), Choco.plus(F, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;

		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, Choco.ZERO), u.get(--uebertrag)), Choco.plus(G, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(F, G), u.get(--uebertrag)), Choco.plus(B, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, B), u.get(--uebertrag)), Choco.plus(E, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, B), u.get(--uebertrag)), Choco.plus(D, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;

		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, C), u.get(--uebertrag)), Choco.plus(F, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, K), u.get(--uebertrag)), Choco.plus(F, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(D, A), u.get(--uebertrag)), Choco.plus(C, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, F), u.get(--uebertrag)), Choco.plus(B, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;

		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(Choco.ZERO, Choco.ZERO), u.get(--uebertrag)), Choco.plus(B, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, J), u.get(--uebertrag)), Choco.plus(E, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, D), u.get(--uebertrag)), Choco.plus(E, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(B, K), u.get(--uebertrag)), Choco.plus(A, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;

		// Alle Uebertraege von Aufgabe X als Variable deklarieren
		u = new ArrayList<>();
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 0, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));
		u.add(Choco.makeIntVar("a" + aufgabe + "u" + u.size(), 0, 1, Options.V_ENUM));

		// Constraints fuer Aufgabe X
		uebertrag = u.size();
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(C, C), u.get(--uebertrag)), Choco.plus(G, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(A, A), u.get(--uebertrag)), Choco.plus(B, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, H), u.get(--uebertrag)), Choco.plus(E, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(G, G), u.get(--uebertrag)), Choco.plus(D, Choco.mult(u.get((uebertrag+1)%u.size()), 10))));
		aufgabe++;
		
		// Constraint dafuer, dass alle Zeichen unterschiedlich sein muessen
		model.addConstraint(Choco.allDifferent(A, B, C, D, E, F, G, H, J, K));
		
		Solver s = new CPSolver();
		s.read(model);
		if(s.solve()) {
			System.out.println("Das Raetsel wurde geloest!");
			System.out.println(A.getName() + " = " + s.getVar(A).getVal());
			System.out.println(B.getName() + " = " + s.getVar(B).getVal());
			System.out.println(C.getName() + " = " + s.getVar(C).getVal());
			System.out.println(D.getName() + " = " + s.getVar(D).getVal());
			System.out.println(E.getName() + " = " + s.getVar(E).getVal());
			System.out.println(F.getName() + " = " + s.getVar(F).getVal());
			System.out.println(G.getName() + " = " + s.getVar(G).getVal());
			System.out.println(H.getName() + " = " + s.getVar(H).getVal());
			System.out.println(J.getName() + " = " + s.getVar(J).getVal());
			System.out.println(K.getName() + " = " + s.getVar(K).getVal());
		} else {
			System.out.println("Das Raetsel konnte nicht geloest werden!");
		}
	}
}