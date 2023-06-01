package garpin.design_patterns.abstract_factory;

public class BoxedWriter implements Writer
{
    @Override
    public void write(String out)
    {
        int boundaryLen = out.length() + 4;

        System.out.println("_".repeat(boundaryLen));

        System.out.println("| " + out + " |");

        System.out.println("=".repeat(boundaryLen));
    }
}