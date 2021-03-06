package com.kraken.gunsmith;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Messages {

	String language;
	
	public Messages(String language) {
          this.language = language;
    }
	
	public void makeMsg(Player player, String msg) {
		
		switch (language) {
		
			case "Spanish":
			case "spanish":
				
				//Start of Spanish messages
				switch (msg) {
				
					case "errorIllegalCommand":
						player.sendMessage(ChatColor.RED + "No reconocido el comando, o no tienes el permiso.");
						break;
				
					case "cmdGuns":
			        	player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Teclea \"/givegun <nombreDeLaArma> para darse la arma.\"");
			        	player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Los nombres: " 
			        					+ ChatColor.GREEN + "sniper" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "br" + ChatColor.GRAY + "/" + ChatColor.GREEN + "battleRifle" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "lmg" + ChatColor.GRAY + "/" + ChatColor.GREEN + "lightMachineGun" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "pistol" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "bow");
			        	break;
						
					case "cmdGiveGun":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | ¡Pew pew!");
						break;
						
					case "errorGunFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el comando. Teclea \"/giveGun <nombreDeLaArma> {jugador}\"");
						break;
						
					case "cmdGiveAmmo":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Cierra y carga.");
						break;
					
					case "errorAmmoFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el comando. Teclea \"/giveAmmo <nombreDeLaArma> {jugador}\"");
						break;
						
					case "errorPlayerNotFound":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | ¡No reconocido el jugador!");
						break;
						
					case "errorWarZoneNotFound":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | ¡Requeras el paquete del WarZone para usar este item!");
						break;
						
					case "errorStatFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el comando. Teclea \"/getStat <nombreDeLaArma> <stat>\"");
						break;
						
					case "errorStatType":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | El stats que son disponible: range (distancia), cooldown (tiempo de reutilizacion)");
						break;
						
					case "errorNoAmmoFound":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No tienes mas municion.");
						break;
						
					case "cmdLang":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Ahora el lenguaje esta espanol.");
						break;
						
					case "errorLangNotFound":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el nombre del lenguaje.");
						break;
						
					case "errorLangFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el comando. Teclea \"/guns language <nombreDelLenguaje>\"");
						break;
						
					case "cmdGlassBreakOn":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Ahora los cartuchos romperan el vidrio.");
						break;
						
					case "cmdGlassBreakOff":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No mas pueden romper el vidrio con los cartuchos.");
						break;
						
					case "errorGlassBreakFormat":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | No reconocido el comando. Teclea \"/guns glassbreak <cierto/falso>\"");
						break;
						
					default:
				
						break;
					
				} 
				break;
			  // End of Spanish messages
			
			default:
		
			  //Start of English messages
				switch (msg) {
				
					case "errorIllegalCommand":
						player.sendMessage(ChatColor.RED + "Your command was not recognized, or you have insufficient permissions.");
						break;
				
					case "cmdGuns":
			        	player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Type \"/givegun <gunName> to give yourself a gun.\"");
			        	player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Names: " 
			        					+ ChatColor.GREEN + "sniper" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "br" + ChatColor.GRAY + "/" + ChatColor.GREEN + "battleRifle" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "lmg" + ChatColor.GRAY + "/" + ChatColor.GREEN + "lightMachineGun" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "pistol" + ChatColor.GRAY + " | "
			        					+ ChatColor.GREEN + "bow");
			        	break;
						
					case "cmdGiveGun":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Pew pew!");
						break;
						
					case "errorGunFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Unrecognized format. Use \"/giveGun <gunName> {player}\"");
						break;
						
					case "cmdGiveAmmo":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Lock 'n load.");
						break;
					
					case "errorAmmoFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Unrecognized format. Use \"/giveAmmo <gunName> {player}\"");
						break;
						
					case "errorPlayerNotFound":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Player not found!");
						break;
						
					case "errorWarZoneNotFound":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | You need the WarZone pack to use that item!");
						break;
						
					case "errorStatFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Unrecognized format. Enter \"/getStats <gunName> <stat>\"");
						break;
						
					case "errorStatType":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Currently available stats: range, cooldown");
						break;
						
					case "errorNoAmmoFound":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | You are out of ammunition.");
						break;
						
					case "cmdLang":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Your language is now set to English.");
						break;
						
					case "errorLangNotFound":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Language name not recognized.");
						break;
						
					case "errorLangFormat":
						player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Unrecognized format. Enter \"/guns language <languageName>\"");
						break;
						
					case "cmdGlassBreakOn":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Firearm rounds will now break glass.");
						break;
						
					case "cmdGlassBreakOff":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Firearm rounds will no longer break glass.");
						break;
						
					case "errorGlassBreakFormat":
    					player.sendMessage(ChatColor.RED + "[GS]" + ChatColor.GRAY + " | Unrecognized format. Enter \"/guns glassbreak <true/false>\"");
						break;
						
					default:
				
						break;
					
				} 
				break;
			  // End of English messages
				
		}
		
	}
	
}
