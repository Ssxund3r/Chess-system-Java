package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class chessPiece extends Piece {
	
	private Color color;

	public chessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position positon) {
		chessPiece p = (chessPiece)getBoard().piece(positon);
		return p != null && p.getColor() != color;
 	}
	
}
