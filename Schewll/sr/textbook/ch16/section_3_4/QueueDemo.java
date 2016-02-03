package textbook.ch16.section_3_4;

public class QueueDemo
{
   public static void main(String[] args)
   {
      CircularArrayQueue q = new CircularArrayQueue();
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      while (!q.empty())
      {
         System.out.println(q.remove());
      }
   }
}
