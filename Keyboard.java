import java.io.*;

public class Keyboard
{
  private static BufferedReader in;
  public static void init()
  {
    in = new BufferedReader(new InputStreamReader(System.in));
  }

  public static char readChar()
  {
     char c = 0;
     try
     {
       c = (char) System.in.read();
       System.in.skip(2);
     }
     catch(IOException e)
     { System.out.println("Unexpected I/O error!"); }
     return c;
  }

  public static int readInt()
  {
    String s = "";
    init();
    try
    {
      s = in.readLine();
    }
    catch(IOException e)
    {
      System.out.println("Not a valid Integer!");
    }
    return Integer.parseInt(s);
  }

  public static float readFloat()
  {
    init();
    String s = "";
    try
    {
      s = in.readLine();
    }
    catch(IOException e)
    {
      System.out.println("Not a valid float!");
    }
    return Float.valueOf(s).floatValue();
  }

  public static double readDouble()
  {
    init();
    String s = "";
    try
    {
      s = in.readLine();
    }
    catch(IOException e)
    {
      System.out.println("Not a valid double!");
    }
    return Double.valueOf(s).doubleValue();
  }

  public static String readLine()
  {
    init();
    String s = "";
    try
    {
      s = in.readLine();
    }
    catch(IOException e)
    {
      System.out.println(e.toString());
    }
    return s;
  }
}

