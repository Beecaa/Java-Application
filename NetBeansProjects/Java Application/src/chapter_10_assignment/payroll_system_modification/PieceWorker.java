package chapter_10_assignment.payroll_system_modification;

public class PieceWorker extends Employeee {
    private double wagePerPiece;
    private int piecesProduced;

    public PieceWorker(String firstName, String lastName, String ssn, double wage, int pieces) {
        super(firstName, lastName, ssn);
        this.wagePerPiece = wage;
        this.piecesProduced = pieces;
    }

    @Override
    public double earnings() {
        return wagePerPiece * piecesProduced;
    }

    @Override
    public String toString() {
        return String.format("PieceWorker Employee: %s\nWage per piece: $%.2f\nPieces produced: %d\nEarnings: $%.2f",
                super.toString(), wagePerPiece, piecesProduced, earnings());
    }
}
