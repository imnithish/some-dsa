package trie;

public class Runner {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
//        trie.insert("cars");
//        trie.insert("cushion");
//        trie.insert("cooker");

        System.out.println(trie.startsWith("cars"));

    }
}
