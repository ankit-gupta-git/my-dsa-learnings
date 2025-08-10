package Trie;

public class TrieBasics {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;

        TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public  static TrieNode root = new TrieNode();

    public static void main(String[] args) {
        String[] words = {"hello", "world", "hi", "her", "hero"};
    }
}
