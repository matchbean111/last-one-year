package org.example.datastruct;

class TrieNode {
    private TrieNode[] children;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }

    public boolean containsKey(char ch) {
        return children[ch - 'A'] != null;
    }

    public TrieNode get(char ch) {
        return children[ch - 'A'];
    }

    public void put(char ch, TrieNode node) {
        children[ch - 'A'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (node.containsKey(currentChar)) {
                node = node.get(currentChar);
            } else {
                return null;
            }
        }
        return node;
    }
}

public class WordSearchWithTrie {
    public static boolean exist(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (trie.startsWith(String.valueOf(board[i][j]))) {
                    if (dfs(board, visited, trie, "", i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, boolean[][] visited, Trie trie, String word, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) {
            return false;
        }

        word += board[row][col];
        if (!trie.startsWith(word)) {
            return false;
        }

        if (trie.search(word)) {
            return true;
        }

        visited[row][col] = true;
        boolean found = dfs(board, visited, trie, word, row + 1, col) ||
                        dfs(board, visited, trie, word, row - 1, col) ||
                        dfs(board, visited, trie, word, row, col + 1) ||
                        dfs(board, visited, trie, word, row, col - 1);
        visited[row][col] = false;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String[] words = {"ABCCED", "SEE", "ABCB"};

        System.out.println("Word \"ABCCED\" exists: " + exist(board, words));
        System.out.println("Word \"SEE\" exists: " + exist(board, words));
        System.out.println("Word \"ABCB\" exists: " + exist(board, words));
    }
}
