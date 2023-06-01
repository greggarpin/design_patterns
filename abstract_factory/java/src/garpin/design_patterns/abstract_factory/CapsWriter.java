package garpin.design_patterns.abstract_factory;

public class CapsWriter implements Writer
{
    @Override
    public void write(String out)
    {
        System.out.println(out.toUpperCase());
    }
}