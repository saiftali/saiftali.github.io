public class Force {

	public static final double gravitationalConstant = 6.673 * Math
			.pow(10, -11);
	private static final double bespinMass = 8.6 * Math.pow(10, 26);
	private static final double cloneMass = 80;
	private static final double coruscantMass = 1.637 * Math.pow(10, 25);
	private static final double deathStarMass = 1.0833095 * Math.pow(10, 18);
	private static final double endorMass = 2.7 * Math.pow(10, 24);
	private static final double imperialStarDestroyerMass = 4 * Math
			.pow(10, 10);
	private static final double kyloRenMass = 89;
	private static final double lukeMass = 73;
	private static final double millenniumFalconMass = 110000;
	private static final double reyMass = 54;
	private static final double sidiousMass = 75;
	private static final double TIEFighterMass = 8000;
	private static final double vaderMass = 136;
	private static final double XWingMass = 10000;
	private static final double yavinMass = 5.299 * Math.pow(10, 27);
	private static final double yodaMass = 17;
	private static final double bespinRadius = 5.9 * Math.pow(10, 7);
	private static final double coruscantRadius = 8.854 * Math.pow(10, 6);
	private static final double deathStarRadius = 160000;
	private static final double endorRadius = 5.2 * Math.pow(10, 6);
	private static final double yavinRadius = 9.6239 * Math.pow(10, 7);
	private static final double kyloRenMaxForce = 850;
	private static final double lukeMaxForce = 900;
	private static final double reyMaxForce = 900;
	private static final double sidiousMaxForce = 1500;
	private static final double vaderMaxForce = 1250;
	private static final double yodaMaxForce = 1500;

	public static double getWeight(double mass, double gravity) {

		return mass * gravity;

	}

	public static double getAcceleration(double force, double mass) {

		return force / mass;

	}

	public static double getDisplacement(double acceleration, double time) {

		return acceleration * Math.pow(time, 2) / 2;

	}

	public static double getEscapeVelocity(double mass, double radius) {

		return Math.pow(2 * mass * gravitationalConstant / radius, 0.5);

	}

	public static double getTotalEnergyLoss(double mass1, double mass2,
			double initialVelocity1, double finalVelocity1,
			double initialVelocity2, double finalVelocity2) {

		return 0.5 * mass1 * Math.pow(initialVelocity1, 2) + 0.5 * mass2
				* Math.pow(initialVelocity2, 2) - 0.5 * mass1
				* Math.pow(finalVelocity1, 2) - 0.5 * mass2
				* Math.pow(finalVelocity2, 2);

	}

	public static double getPercentEnergyLoss(double mass1, double mass2,
			double initialVelocity1, double finalVelocity1,
			double initialVelocity2, double finalVelocity2) {

		return getTotalEnergyLoss(mass1, mass2, initialVelocity1,
				finalVelocity1, initialVelocity2, finalVelocity2)
				/ (0.5 * mass1 * Math.pow(initialVelocity1, 2) + 0.5 * mass2
						* Math.pow(initialVelocity2, 2)) * 100;

	}

	public static double[] getFinalElasticVelocity(double mass1, double mass2,
			double velocity1, double velocity2) {

		double velocityArray[] = new double[2];
		velocityArray[0] = mass2 * velocity2 / mass1;
		velocityArray[1] = mass1 * velocity1 / mass2;
		return velocityArray;

	}

	public static double getFinalInelasticVelocity(double mass1, double mass2,
			double velocity1, double velocity2) {

		return (mass1 * velocity1 + mass2 * velocity2) / (mass1 + mass2);

	}
}
