package com.example.Services;

import com.example.Entities.Game;
import com.example.Entities.Platform;
import com.example.Entities.Statistic;
import com.example.Entities.VideoGameGenre;
import com.example.Repositories.IGameRepository;
import com.example.Repositories.IStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.Entities.GameStatus.*;

@Service
public class StatisticService {

    @Autowired
    IStatisticRepository statisticRepository;

    @Autowired
    IGameRepository gameRepository;


    //Create
    public Statistic saveStatistic(Statistic statistic){
        return statisticRepository.save(statistic);
    }


    //Show one
    public Optional<Statistic> findStatisticById(Long id) {
        return statisticRepository.findById(id);
    }

    //Completed
    public int nbGamesCompleted(List<Game> games){
        int gamesFinished = 0;
        
        for (int i=0; i <= games.size()-1; i++){
            if (games.get(i).getState() == COMPLETED){
                gamesFinished+=1;
            }
        }
        return gamesFinished;
    }

    //In Progress
    public int nbGamesInProgress(List<Game> games){
        int gamesInProgress = 0;

        for (int i=0; i <= games.size()-1; i++){
            if (games.get(i).getState() == IN_PROGRESS){
                gamesInProgress+=1;
            }
        }
        return gamesInProgress;
    }

    //Not Started
    public int nbGamesNotStarted(List<Game> games){
        int gamesNotStarted = 0;

        for (int i=0; i <= games.size()-1; i++){
            if (games.get(i).getState() == NOT_STARTED){
                gamesNotStarted+=1;
            }
        }
        return gamesNotStarted;
    }

    //By Platform
    public int countGamesByPlatform(List<Game> games, Platform platform) {
        int gamesByPlatform = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform) {
                gamesByPlatform++;
            }
        }

        return gamesByPlatform;
    }

    //By Genre
    public int countGamesByGenre(List<Game> games, VideoGameGenre videoGameGenre) {
        int gamesByGenre = 0;

        for (Game game : games) {
            if (game.getVideoGameGenre() == videoGameGenre) {
                gamesByGenre++;
            }
        }

        return gamesByGenre;
    }

    //Completed and By Genre
    public int countGamesCompletedByGenre(List<Game> games, VideoGameGenre videoGameGenre) {
        int gamesByGenreAndCompleted = 0;

        for (Game game : games) {
            if (game.getVideoGameGenre() == videoGameGenre && game.getState() == COMPLETED) {
                gamesByGenreAndCompleted++;
            }
        }

        return gamesByGenreAndCompleted;
    }


    //In Progress and By Genre
    public int countGamesInProgressByGenre(List<Game> games, VideoGameGenre videoGameGenre) {
        int gamesByGenreAndCompleted = 0;

        for (Game game : games) {
            if (game.getVideoGameGenre() == videoGameGenre && game.getState() == IN_PROGRESS) {
                gamesByGenreAndCompleted++;
            }
        }

        return gamesByGenreAndCompleted;
    }


    //Not Started and By Genre
    public int countGamesNotStaredByGenre(List<Game> games, VideoGameGenre videoGameGenre) {
        int gamesByGenreAndCompleted = 0;

        for (Game game : games) {
            if (game.getVideoGameGenre() == videoGameGenre && game.getState() == NOT_STARTED) {
                gamesByGenreAndCompleted++;
            }
        }

        return gamesByGenreAndCompleted;
    }


    //Completed and By Platform
    public int countGamesCompletedByPlatform(List<Game> games, Platform platform) {
        int gamesByPlatformAndCompleted = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == COMPLETED) {
                gamesByPlatformAndCompleted++;
            }
        }

        return gamesByPlatformAndCompleted;
    }


    //In Progress and By Platform
    public int countGamesInProgressByPlatform(List<Game> games, Platform platform) {
        int gamesByPlatformAndInProgress = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == IN_PROGRESS) {
                gamesByPlatformAndInProgress++;
            }
        }

        return gamesByPlatformAndInProgress;
    }


    //Not Started and By Platform
    public int countGamesNotStartedByPlatform(List<Game> games, Platform platform) {
        int gamesByPlatformAndNotStarted = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == NOT_STARTED) {
                gamesByPlatformAndNotStarted++;
            }
        }

        return gamesByPlatformAndNotStarted;
    }


    //Completed and By Genre and By Platform
    public int countGamesCompletedByPlatformAndGenre(List<Game> games, Platform platform, VideoGameGenre videoGameGenre) {
        int gamesByPlatformAndGenreAndCompleted = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == COMPLETED && game.getVideoGameGenre() == videoGameGenre) {
                gamesByPlatformAndGenreAndCompleted++;
            }
        }

        return gamesByPlatformAndGenreAndCompleted;
    }

    //In Progress and By Genre and By Platform
    public int countGamesInProgressByPlatformAndGenre(List<Game> games, Platform platform, VideoGameGenre videoGameGenre) {
        int gamesByPlatformAndGenreAndInProgress = 0;

        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == IN_PROGRESS && game.getVideoGameGenre() == videoGameGenre) {
                gamesByPlatformAndGenreAndInProgress++;
            }
        }

        return gamesByPlatformAndGenreAndInProgress;
    }

    //Not Started and By Genre and By Platform
    public int countGamesNotStartedByPlatformAndGenre(List<Game> games, Platform platform, VideoGameGenre videoGameGenre) {
        int gamesByPlatformAndGenreAndNotStarted = 0;



        for (Game game : games) {
            if (game.getPlatform() == platform && game.getState() == NOT_STARTED && game.getVideoGameGenre() == videoGameGenre) {
                gamesByPlatformAndGenreAndNotStarted++;
            }
        }

        return gamesByPlatformAndGenreAndNotStarted;
    }

    //Show all


    public List<Statistic> findAll() {
        return statisticRepository.findAll();
    }


    //Update
    public Statistic updateStatistic(Statistic statistic){
        return statisticRepository.save(statistic);
    }


    //Delete
    public void deleteStatistic(Long id){
         statisticRepository.deleteById(id);
    }
}
