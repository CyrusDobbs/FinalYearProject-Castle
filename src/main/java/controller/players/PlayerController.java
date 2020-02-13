package controller.players;

import actions.CastleMove;
import model.GameState;
import model.Player;

public abstract class PlayerController {

    Player playerModel;

    public abstract CastleMove getMove(GameState gameState);

    public PlayerController(Player playerModel) {
        this.playerModel = playerModel;
    }
}
