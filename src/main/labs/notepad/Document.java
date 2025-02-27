package labs.notepad;

import java.util.ArrayList;

public class Document {
    public ArrayList<String> lines;

    /**
     * Initialize a document containing no text.
     */
    public Document() {
        lines = new ArrayList<>();
    }

    /**
     * Copy constructor. Create a document that is identical to the provided
     * document.
     *
     * @param other The document to copy
     */
    public Document(Document other) {
        this.lines = new ArrayList<>(other.lines);
    }

    /**
     * Add a single line of text to the end of the document. The line is stored
     * "as-is". I.e. no newline characters are added.
     *
     * @param line The line of text to add
     */
    public void appendLine(String line) {
        lines.add(line);
    }

    /**
     * Delete the indicate line of text. This method uses 0-based indexing. This
     * method performs no error checking. It may raise an exception if an invalid
     * line number is provided.
     *
     * @param lineNumber The index of the line to delete
     */
    public void deleteLine(int lineNumber) {
        if(lineNumber < 0 || lineNumber >= lines.size()) {
            System.out.println("Line out of bounds!");
        }
        lines.remove(lineNumber);
    }

    /**
     * This method returns the single longest line of text in the document. The
     * line is returned without a trailing newline character. If the document is
     * empty, the return value should be an empty string ("").
     *
     * @return The longest line
     */
    public String longestLine() {
        if(lines.isEmpty()) {
            return null;
        }
        String longest = lines.get(0);
        for(String line : lines) {
            if(line.length() > longest.length()) {
                longest = line;
            }
        }
        return longest;
    }

    /**
     * This method returns the entire document as a single string. Each line
     * (including the last) will be terminated with a single newline character.
     * If the document is empty, then return value will be an empty string.
     *
     * @return The entire document as a single string
     */
    public String toString() {
        if(lines.isEmpty()) {
            return "";
        }
        String result = "";
        for(String line : lines) {
            result = result + line + "\n";
        }
        return result;

    }

    /**
     * Return true if this document is equal to another document. Two documents
     * are considered equal if each line of text they contain is exactly the
     * same. (HINT: the ArrayList class provides an equals method that returns
     * true if all entries in the two ArrayLists are equal.)
     *
     * @param other The other document
     * @return true if the two documents are the same, false otherwise.
     */
    public boolean equals(Document other) {
        if(other == null || !(other instanceof Document)) {
            return false;
        }
        Document that = (Document) other;
        return this.lines.equals(that.lines);
    }

}
