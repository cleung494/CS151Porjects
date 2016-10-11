/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public interface Text {
    String message();
    
    class PlainText implements Text
    {
        private String send, receive;
        int num_times;
        public PlainText(String sender, String receiver, int num_read)
        {
            send = sender;
            receive = receiver;
            num_times = num_read;
        }
        public String message() {
            return "From: " + send + "\n" + receive;
        }
        
    }
    class OneTimeText implements Text
    {
        private String send, receive;
        int num_times;
        public OneTimeText(String sender, String receiver, int num_read)
        {
            send = sender;
            receive = receiver;
            num_times = num_read;
        }
        public String message() {
            return "";
        }
        
    }
}
