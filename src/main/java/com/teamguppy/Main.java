package com.teamguppy;

import com.teamguppy.controller.Controller;
import com.teamguppy.model.Game;
import com.teamguppy.view.View;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {

    Game game = new Game();
    View view = new View();
    Controller controller = new Controller(game, view);
    controller.displayAsciiBanner();
    controller.displayAboutGame();
    Game.landingRoom();

  }
}
