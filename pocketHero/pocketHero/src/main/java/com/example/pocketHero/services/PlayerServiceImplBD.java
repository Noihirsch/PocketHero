package com.example.pocketHero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pocketHero.domains.Campaign;
import com.example.pocketHero.domains.Player;
import com.example.pocketHero.repositories.CampaignRepository;
import com.example.pocketHero.repositories.PlayerRepository;

@Service
public class PlayerServiceImplBD implements PlayerService {

    @Autowired 
    PlayerRepository playerRepository;

    @Autowired
    CampaignRepository campaignRepository;

    public Player create(Player player){
        return playerRepository.save(player);
    }

    public List<Player> findAllPlayers(){
        return playerRepository.findAll();
    }

    public Player findById(Long id){
        return playerRepository.findById(id).orElse(null);
    }

    public Player findByUsername(String username){
        return playerRepository.findByUsername(username);

    }

    public Player edit(Player player) {
        return playerRepository.save(player);
    }

    public void delete(Long id) {
        playerRepository.deleteById(id);
   }


}
