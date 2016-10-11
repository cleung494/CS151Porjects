/**
   A message from a user.
*/
public class Message
{
   /**
    *  Construct a Message object.
    *  @param sender the username of the sender
    *  //TODO: Or the User to make Reply simple???
    *  @param messageText the message text
    */
   
   public Message(String sender, String messageText)
   {
      this.sender = sender;
      text = messageText;
   }

   /**
    * Get the message text.
    * @return message text
    */
   public String getText()
   {
       if (num_times_read == 0)
       {
           num_times_read++;
       Text Plain = new OneTimeText(sender, text,num_times_read);
       
       }
       else{
           num_times_read++;
           return new Text();
       }
   }

   private String sender;
   private String text;
   private int num_times_read = 0;
}
