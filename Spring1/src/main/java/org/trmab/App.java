package org.trmab;

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
        // now lets do it through spring we had beanFactory which is old and AllicationContext is better
        //beanfactory is depreciated

        //we are going to explore xml then java base then annonation
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //type casting
        //now we also have to tell spring to create obejct of this class alien so lets do it with xml
        //now as its a class path we have to gho to class path which is main > java and make resources folder in it
        //nad make file spring.xml or context.xml and then pass the name of file to ClassPathXmlApplicationContext
        //spring 6 bean configuration

//        Alien obj = new Alien(); no need for it now as spring taking care of it
//        Alien obj = (Alien) context.getBean("alien");
        //one more thing we are writing (Alien) because we are aliasing it as it returns the object which is why we have to tell its type
        //there is one more way to do it we can use getBean other method which take type too like below now no need for alising
//        Alien obj = context.getBean("alien", Alien.class);
        //also you dont need to specify name too we are getting bean by type and you can remove id in spring.xml bean too
//        Alien obj = context.getBean(Alien.class);
        //but the issue can create in below condition Suppose as we have made Desktop and laptop implementing Computer
        //Suppose i write Desktop obj = context.getBean(Desktop.class) and Computer obj = context.getBean(Computer.class)
        //then it will throw error because laptop and desktop both implemeting same interface so it will get confused
        //but this will happen if you dont mention primary in spring.xml bean but its good to go my name so lets change back
        Alien obj = (Alien) context.getBean("alien");


        //doesnt matter if you call getBean with default scope attribute which we mention the the <bean> mention in class path
        // it will only create object for once and then return reference of it each time its becuase its the singleton scope
        //we also have scopes liek prototype, request or session which is used for web or websocket
        //now if i want it to create object everytime on calling it lets change to scope="prototype"
        //also in prototype scope you have to create object by your self singleton creates object on it own

//        obj.setAge(21);
        // nnow if you dont want to assign value above here through setter go to spring.xml classpath file and <Property>
        System.out.println(obj.getAge());
        obj.code();

    }
}
