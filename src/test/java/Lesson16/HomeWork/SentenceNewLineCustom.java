package Lesson16.HomeWork;

public class SentenceNewLineCustom {

    public static void main(String[] args) {

        String s1 = "This chapter introduces and elaborates the Representational State Transfer (REST) " +
                "architectural style for distributed hypermedia systems, describing the software engineering" +
                "principles guiding REST and the interaction constraints chosen to retain those principles, " +
                "while contrasting them to the constraints of other architectural styles. REST is a hybrid style " +
                "derived from several of the network-based architectural styles described in Chapter 3 and " +
                "combined with additional constraints that define a uniform connector interface. The software " +
                "architecture framework of Chapter 1 is used to define the architectural elements of REST and " +
                "examine sample process, connector, and data views of prototypical architectures.";

        char c1;

        for (int i=0; i<s1.length(); i++){

            c1 = s1.charAt(i);

            if (c1 == '.'){
                System.out.println(c1);
                continue;
            }
            System.out.print(c1);
        }
    }
}
