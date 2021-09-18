package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class chessPiece extends Piece {
	
	private Color color;
	private int moveCount;

	public chessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increasedMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	
	
	
	protected boolean isThereOpponentPiece(Position positon) {
		chessPiece p = (chessPiece)getBoard().piece(positon);
		return p != null && p.getColor() != color;
 	}
	
}
