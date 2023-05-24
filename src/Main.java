public class Main {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Human swedishPerson = new Swedish("GurraG");
        Human spanishPerson = new Spanish("Jan");
        Human englishPerson = new English("Pual");
        Human latinPerson = new ThiccLatino("Ceasar");

        forum.makePeopleTalk(swedishPerson);
        forum.makePeopleTalk(spanishPerson);
        forum.makePeopleTalk(englishPerson);
        forum.makePeopleTalk(latinPerson);

    }
}