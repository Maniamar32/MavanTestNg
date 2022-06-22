package InvalidNumber;

public class InvalidNumberExc extends Exception {
	public InvalidNumberExc()
	{
		super("Inavalid Number it should be between 1 t0 10");
	}

public InvalidNumberExc(String message)
{
	super(message);
}
}
