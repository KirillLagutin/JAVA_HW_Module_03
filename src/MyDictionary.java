class MyDictionary {
    private String rusWord = "";
    private String engWord = "";

    public MyDictionary() { }
    public MyDictionary(String rusWord, String engWord) {
        this.rusWord = rusWord;
        this.engWord = engWord;
    }

    public String getRusWord() {
        return rusWord;
    }
    public String getEngWord() { return engWord; }

    public void setRusWord(String rusWord) {
        this.rusWord = rusWord;
    }
    public void setEngWord(String engWord) { this.engWord = engWord; }

    @Override
    public String toString() {
        return "Перевод слова [" + rusWord + "] - " + engWord;
    }
}
