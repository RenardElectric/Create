package com.simibubi.create.foundation.config;

public class CTrains extends ConfigBase {

	public final ConfigBool trainsCauseDamage = b(true, "trainsCauseDamage", Comments.trainsCauseDamage);
	public final ConfigInt maxAssemblyLength = i(128, 5, "maxAssemblyLength", Comments.maxAssemblyLength);
	public final ConfigInt maxBogeyCount = i(20, 1, "maxBogeyCount", Comments.maxBogeyCount);
	public final ConfigFloat manualTrainSpeedModifier = f(.75f, 0, "manualTrainSpeedModifier", Comments.manualTrainSpeedModifier);

	public final ConfigGroup trainStats = group(1, "trainStats", "Standard Trains");
	public final ConfigFloat trainTopSpeed = f(28, 0, "trainTopSpeed", Comments.mps, Comments.trainTopSpeed);
	public final ConfigFloat trainTurningTopSpeed = f(14, 0, "trainTurningTopSpeed", Comments.mps, Comments.trainTurningTopSpeed);
	public final ConfigFloat trainAcceleration = f(3, 0, "trainAcceleration", Comments.acc, Comments.trainAcceleration);

	public final ConfigGroup poweredTrainStats = group(1, "poweredTrainStats", "Powered Trains");
	public final ConfigFloat poweredTrainTopSpeed = f(40, 0, "poweredTrainTopSpeed", Comments.mps, Comments.poweredTrainTopSpeed);
	public final ConfigFloat poweredTrainTurningTopSpeed = f(20, 0, "poweredTrainTurningTopSpeed", Comments.mps, Comments.poweredTrainTurningTopSpeed);
	public final ConfigFloat poweredTrainAcceleration = f(3, 0, "poweredTrainAcceleration", Comments.acc, Comments.poweredTrainAcceleration);

	public final ConfigGroup custom = group(1, "custom", "custom configs");
	public final ConfigInt maxTrackPlacementDistance = i(32,32, "maxTrackPlacementDistance", Comments.maxTrackPlacementDistance);
	public final ConfigBool canTurnMoreThan90Degrees = b(false, "canTurnMoreThan90Degrees", Comments.canTurnMoreThan90Degrees);
	public final ConfigBool canTurnSharp = b(false, "canTurnSharp", Comments.canTurnSharp);
	public final ConfigBool canBeSteep = b(false, "canBeSteep", Comments.canBeSteep);
	public final ConfigBool canBePerpendicular = b(false, "canBePerpendicular", Comments.canBePerpendicular);
	public final ConfigBool canCreateSlopedSBends = b(false, "canCreateSlopedSBends", Comments.canCreateSlopedSBends);
	public final ConfigInt maxTrainRelocationDistance = i(24,24, "maxTrainRelocationDistance", Comments.maxTrainRelocationDistance);
	public final ConfigBool canCollide = b(true, "canCollide", Comments.canCollide);

	@Override
	public String getName() {
		return "trains";
	}

	private static class Comments {
		static String canCreateSlopedSBends = "Whether sloped S-Bends can be made.";
		static String canBePerpendicular = "Whether tracks can be perpendicular.";
		static String canBeSteep = "Whether tracks can be steep.";
		static String canTurnSharp = "Whether tracks can turn sharp.";
		static String canTurnMoreThan90Degrees = "Whether tracks can turn more than 90 degrees when placed.";
		static String maxTrackPlacementDistance = "Maximum distance to place a track.";
		static String maxTrainRelocationDistance = "Maximum distance to relocate a train.";
		static String canCollide = "Whether trains can collide.";
		static String mps = "[in Blocks/Second]";
		static String acc = "[in Blocks/Second²]";
		static String trainTopSpeed = "The top speed of any assembled Train.";
		static String trainTurningTopSpeed = "The top speed of Trains during a turn.";
		static String trainAcceleration = "The acceleration of any assembled Train.";
		static String poweredTrainTopSpeed = "The top speed of powered Trains.";
		static String poweredTrainTurningTopSpeed = "The top speed of powered Trains during a turn.";
		static String poweredTrainAcceleration = "The acceleration of powered Trains.";
		static String trainsCauseDamage = "Whether moving Trains can hurt colliding mobs and players.";
		static String maxAssemblyLength = "Maximum length of a Train Stations' assembly track.";
		static String maxBogeyCount = "Maximum amount of bogeys assembled as a single Train.";
		static String manualTrainSpeedModifier = "Relative speed of a manually controlled Train compared to a Scheduled one.";
	}

}
