package Lesson16.HomeWork;

public class SentenceNewLineZaur {

    public static void main(String[] args) {
//        String s1 = "Текст (від лат. textum — зв’язок, поєднання, тканина) — писемний або усний мовленнєвий масив, " +
//                "що становить лінійну послідовність висловлень, об’єднаних у ближчій перспективі смисловими і " +
//                "форм.-грамат. зв’язками, а в загальнокомпозиц., дистантному плані — спільною тем. і сюжетною " +
//                "заданістю. Одиницею Т. є реально вичленовуваний найменший словес. масив, що складається з лінійно " +
//                "розташованої сукупності речень, об’єднаних у тем. і структурну цілісність, після якої йде ін. " +
//                "цілісність того ж рівня. Найменша реальна одиниця Т. — надфразна єдність, абзац. На рівень " +
//                "реальних одиниць Т. можна поставити також період, оскільки він, хоч і зберігає за собою статус " +
//                "одного речення, становить розгалужену синтакс. композицію, гармонійно організовані частини якої " +
//                "утворюють складну тем. і структур. цілісність. Ознак реальної одиниці Т. може набувати й окреме " +
//                "(не періодичної структури) речення — якщо на ньому концентрується особлива увага, винесене воно в " +
//                "позицію абзаца і має звичайну для надфразної єдності смислову і структурну автономність. У " +
//                "структурі Т. повністю реалізується структура абзаца з усіма властивими йому смисловими і " +
//                "форм.грамат. засобами зв’язку висловлень. Абзаци входять у більші за обсягом мовленнєві масиви, " +
//                "формуючи макроструктуру тексту і забезпечуючи його цілісність за допомогою дистантно реалізованих " +
//                "смислових і форм.-мовних міжфразових зв’язків. Одиницями Т. в більш масштабному вимірі, в " +
//                "перспективі всієї його глибини є розділи, підрозділи, глави.";


        String s1 = "This chapter introduces and elaborates the Representational State Transfer (REST) " +
                "architectural style for distributed hypermedia systems, describing the software engineering" +
                "principles guiding REST and the interaction constraints chosen to retain those principles, " +
                "while contrasting them to the constraints of other architectural styles. REST is a hybrid style " +
                "derived from several of the network-based architectural styles described in Chapter 3 and " +
                "combined with additional constraints that define a uniform connector interface. The software " +
                "architecture framework of Chapter 1 is used to define the architectural elements of REST and " +
                "examine sample process, connector, and data views of prototypical architectures.";

        String s2 = s1.toUpperCase();

        char c1;
        char c2;

        for (int i=0; i< s1.length(); i++){

            c1=s1.charAt(i);
            c2=s2.charAt(i);

            if (c1 != ',' && c1 != '.' && c1 != ' ' && c1 !=':' && c1 != ';' && c1 !='!' && c1 !='?'
                    && c1!='-' && c1!='"' && c1!='(' && c1!= ')' && c1==c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();

        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
