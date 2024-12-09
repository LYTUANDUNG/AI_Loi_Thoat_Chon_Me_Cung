package PSO;

import java.util.Random;

public class PSOConfig {
	public static final double INERTIA_WEIGHT = 0.6;
	public static final double COGNITIVE_COEFFICIENT =2;
	public static final double SOCIAL_COEFFICIENT =2;
	public static final int PARTICLE_COUNT = 100;
	public static final int MAX_ITERATIONS = 1000;
	public static final double MAX_VELOCITY =2;
	public static final double MIN_VELOCITY =-2;
	public static final Random RANDOM = new Random();
}
