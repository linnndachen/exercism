class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake ? false : true;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake) ? true : false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake) ? true : false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake ? true : false;
        } else {
            return prisonerIsAwake && (!knightIsAwake && !archerIsAwake) ? true : false;
        }
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
