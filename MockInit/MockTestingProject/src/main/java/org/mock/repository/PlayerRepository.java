package org.mock.repository;

import org.mock.persistence.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements  IPlayerRepository{


    private List<Player> playerDatabase = new ArrayList<>(List.of(
            new Player(1L, "Lionel Messi", "Inter Miami", "Forward"),
            new Player(2L, "Kevin De Bruyne", "Manchester City", "Midfielder"),
            new Player(3L, "Virgil van Dijk", "Liverpool", "Defender"),
            new Player(4L, "Thibaut Courtois", "Real Madrid", "Goalkeeper"),
            new Player(5L, "Kylian Mbappé", "Paris Saint-Germain", "Forward"),
            new Player(6L, "Luka Modrić", "Real Madrid", "Midfielder")

    ));

    @Override
    public List<Player> findAll() {
        System.out.println(" --> Método findAll real!!");
        return this.findAll();
    }

    @Override
    public Player findById(Long id) {
        System.out.println(" --> Método findById real!!");
        return this.playerDatabase.stream()
                .filter(player -> player.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void save(Player player) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
