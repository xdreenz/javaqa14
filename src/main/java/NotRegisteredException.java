public class NotRegisteredException extends RuntimeException{
    public NotRegisteredException(String name) {
        super("Игрок " + name + " не зарегистрирован, соревнования не будет!");
    }
}
