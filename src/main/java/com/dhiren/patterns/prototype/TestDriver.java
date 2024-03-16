package com.dhiren.patterns.prototype;

public class TestDriver {

    public static void main(String[] args) throws CloneNotSupportedException {
        Game game = new Game();
        game.setId(1);
        game.setName("Counter Strike");
        game.setMembership(new Membership("license"));

        Game game2 = game.clone();

        System.out.println(game);
        System.out.println(game2);

        Game game3 = new Game(game);
        System.out.println(game3);
    }

}
