package com.wyh2004.myplugin.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class Textboard {
    public static void Text(Player player){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("text", "dummy");
        objective.setDisplayName(ChatColor.GREEN + "记得点赞");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score score1 = objective.getScore("玩家名称: " + player.getDisplayName());
        score1.setScore(1);

        Score score2 = objective.getScore("经验值: " + player.getExp());
        score2.setScore(2);

        player.setScoreboard(scoreboard);
    }
}
