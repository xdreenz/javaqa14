public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String message) {
        super("Игрок " + message + " не зарегистрирован, соревнования не будет!");
    }
}
