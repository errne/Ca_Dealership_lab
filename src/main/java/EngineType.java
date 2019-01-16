public enum EngineType {
    PETROL("petrol", 30),
    HYBRID("hybrid", 25),
    ELECTRIC("electric", 20);

    private final String type;
    private final int rev;

    EngineType(String type, int rev){
        this.type = type;
        this.rev = rev;
    }
}
