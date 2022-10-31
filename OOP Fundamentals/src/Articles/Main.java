package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String articleTitle = input.split(", ")[0];
        String articleContent = input.split(", ")[1];
        String articleAuthor = input.split(", ")[2];
        Article article = new Article(articleTitle,articleContent,articleAuthor);

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String command = sc.nextLine();
            if(command.contains("Edit")){
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            }
            else if(command.contains("ChangeAuthor")){
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
            else if(command.contains("Rename")){
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            }
        }
        System.out.println(article);
    }
}
