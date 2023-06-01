package garpin.design_patterns.abstract_factory;

public class PlainWriter implements Writer
{
    @Override
    public void write(String out)
    {
        System.out.println(out);
    }
}