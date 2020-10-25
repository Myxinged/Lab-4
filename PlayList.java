public class PlayList {
private Song first;
public Playlist(){
// constructor for creating a new list
   first=null;
}
public void addSong(Song s){
   //list is empty
   if(first==null) {
       s.setNext(first);
       first=s;
       return;
   }
   //add song at the end of list
   Song temp=first;
   while(temp.getNext()!=null){
       temp=temp.getNext();
   }
   temp.setNext(s);
}
public Song listenToSong(){
   Song temp=first;
   first=first.getNext();
   return temp;
}
public void printPlyalist() {
   Song temp=first;
   System.out.println("Playlist");
   System.out.println("----------");
   while(temp!=null) {
       System.out.println(temp.getTrack());
       temp=temp.getNext();
   }
}
}
