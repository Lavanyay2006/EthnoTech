class Post {
    String content;
    Post next;
    Post prev;
     Post(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
class SocialMediaFeed {
Post head = null;
    Post tail = null;
    Post current = null;
    public void addPost(String content) {
     Post newPost = new Post(content);
      if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
        System.out.println("Post Added: " + content);
    }
    public void addSponsoredPost(String content) {
    Post sponsored = new Post("[Sponsored] " + content);
    if (head == null) {
            head = tail = current = sponsored;
        } else {
            sponsored.next = head;
            head.prev = sponsored;
            head = sponsored;
        }
       System.out.println("Sponsored Post Added!");
    }
      public void nextPost() {
      if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Next Post: " + current.content);
        } else {
            System.out.println("No next post available.");
        }
    }
     public void previousPost() {
     if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Previous Post: " + current.content);
        } else {
            System.out.println("No previous post available.");
        }
    }
    public void deleteCurrentPost() {
    if (current == null) {
            System.out.println("No post to delete.");
            return;
        }
        System.out.println("Deleting Post: " + current.content);
        if (head == tail) {
            head = tail = current = null;
            return;
        }
           if (current == head) {
            head = head.next;
            head.prev = null;
            current = head;
            return;
        }
           if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            current = tail;
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current = current.next;
    }
      public void displayFeed() {
      if (head == null) {
            System.out.println("Feed is empty.");
            return;
        }
Post temp = head;
System.out.println("\n--- Social Media Feed ---");

        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
public static void main(String[] args) {
SocialMediaFeed feed = new SocialMediaFeed();
 feed.addPost("User1: Enjoying vacation!");
        feed.addPost("User2: Learning Java Linked List");
        feed.addPost("User3: Good Morning!");
        feed.addSponsoredPost("Buy One Get One Free!");
        feed.displayFeed();
        System.out.println("\nCurrent Post: " + feed.current.content);
        feed.nextPost();
        feed.nextPost();
        feed.previousPost();
        feed.deleteCurrentPost();
        feed.displayFeed();
    }
}