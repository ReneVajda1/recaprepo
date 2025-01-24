package StringBuilder;

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!

        System.out.println(url);


        urlFixer(url);


    }

    public static void urlFixer(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.replace(3,15,"sdfgReplacedTEXT");
        System.out.println(sb.toString());
    }



    public static void urlFixer2(String input){
        StringBuilder sb = new StringBuilder(input);

        if (input.contains("dishwasher")) {
        input.replace("dishwasher","Galaxy");
        System.out.println(input + " asdf ");

        }

    }
}
