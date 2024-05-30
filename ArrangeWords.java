class ArrangeWords {
    public String arrangeWords(String text) {
        StringBuffer sb = new StringBuffer("");
        String[] temp = text.split(" ");
        temp[0] = temp[0].toLowerCase();
        Arrays.sort(temp, (a,b) -> Integer.compare(a.length(), b.length()));
        temp[0] = temp[0].substring(0,1).toUpperCase() + temp[0].substring(1);
     
        for(int i=0; i<temp.length; i++){
            sb.append(temp[i]);
            if(i != temp.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
