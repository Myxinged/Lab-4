public class SongHistoryList {
private Song first;
public SongHistoryList(){
first=null;
}
public void addSong(Song s){
   s.setNext(first);
   first=s;
}
public Song lastListened(){
// retrieves the next song to listen to
   Song temp=first;
   first=first.getNext();
   return temp;
}
public void printHistory() {
   Song temp=first;
   System.out.println("History");
   System.out.println("-----------");
   while(temp!=null) {
       System.out.println(temp.getTrack());
       temp=temp.getNext();
   }
}
}
