package fr.limoges;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Vehicule ride = (Vehicule) context.getBean("riding");
        ride.drive();
    }
}
