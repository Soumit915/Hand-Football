import java.util.*;
class FifaPrograme_Modified
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter,\n1 to play against computer(90 minutes together)\n2 to play against computer(90 minutes each)\nEnter your choice : ");
        int a = sc.nextInt();
        
        int st = (int)(Math.random()*18);
        switch(st)
        {
            case 0 : System.out.println("Welcome,to Estadio Maracana");
                     break;
            
            case 1 : System.out.println("Welcome,to Rio de Janerio");
                     break;
                     
            case 2 : System.out.println("Welcome,to Dos Santos");
                     break;
                     
            case 3 : System.out.println("Welcome,to Manchester City");
                     break;
            
            case 4 : System.out.println("Welcome,to Brasilia");
                     break;
            
            case 5 : System.out.println("Welcome,to Royal Federation");
                     break;
                     
            case 6 : System.out.println("Welcome,to Erina Coreynhiyance");
                     break;
                     
            case 7 : System.out.println("Welcome,to Nassional Mani Garincha");
                     break;
                     
            case 8 : System.out.println("Welcome,to Estadio Kastelao");
                     break;
            
            case 9 : System.out.println("Welcome,to Estadio Mianrio");
                     break;
                     
            case 10 : System.out.println("Welcome,to Estadio Bira Rio");
                      break;
                     
            case 11 : System.out.println("Welcome,to Erina Fonte Nova");
                      break;
                     
            case 12 : System.out.println("Welcome,to Erina Paronambuka");
                      break;
                     
            case 13 : System.out.println("Welcome,to Erina Pantanal");
                      break;
                      
            case 14 : System.out.println("Welcome,to Erina da Amazonia");
                      break;
                      
            case 15 : System.out.println("Welcome,to Erina das Dunas");
                      break;
                      
            case 16 : System.out.println("Welcome,to Erina da Byksada");
                      break;
                      
            case 17 : System.out.println("Welcome,to Olympic Style");
                      break;
        }
        
        switch(a)
        {
            case 1 : System.out.print("");
                     String wstr = sc.nextLine();
                     
                     System.out.print("Enter your team : ");
                     String str1 = sc.nextLine();

                     System.out.print("Enter your player : ");
                     String str2 = sc.nextLine();
                     
                     int i;
                     String st1 = "";
                     
                     for(i = 0;i <= 2;i++)
                     {
                         st1 += str1.charAt(i);
                     }
                     
                     int sn1 = str2.length();
                     int ai,ti = 0,sp = 0;
                     char st2;char tt = ' ';
                     for(ai = 0;ai < sn1;ai++)
                     {
                         st2 = str2.charAt(ai);
                         if(st2 == tt)
                         {
                             sp++;
                             ti = ai;
                         }
                     }
                     
                     int j;ti++;
                     String gi2 = "";
                     for(j = ti;j < sn1;j++)
                     {
                         gi2 += str2.charAt(j);
                     }
                     String ti2;
                     if(sp > 0)
                     {
                         ti2 = gi2;
                     }
                     else
                     {
                         ti2 = str2;
                     }
                     
                     System.out.print("Time for toss\nEnter,\n1 to choose heads\n2 to choose tails\nEnter your choice : ");
                     int b = sc.nextInt();
                     
                     int b1 =(int)(Math.random()*2);
                     int k,gu = 0,gc = 0,sm = 0,k1,ps = 1,sm1 = 0;
                     int k5,gu1 = 0,gc1 = 0,sm2 = 0,k6,psi = 1,sm3 = 0;
                     int l,gu2 = 0,gc2 = 0,am = 0,l1,rs = 1,am1 = 0;
                     int l5,gu3 = 0,gc3 = 0,am2 = 0,l6,rsi = 1,am3 = 0;
                     
                     if(((b == 1) && (b1 == 0))||((b == 2) && (b1 == 1)))
                     {
                        System.out.print("You have won the toss against COM.\nEnter,\n1 to kick-of\n2 to safe\nEnter your choice : ");
                        int c = sc.nextInt();
                        
                        switch(c)
                        {
                            case 1 : do
                                     {
                                         for(k = 1;sm <= 90;k++)
                                         {
                                             if(k % 2 == 1)
                                             {
                                                 int l10 = 0;
                                                 System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + sm + "--" + gc + "-Com");
                                                 System.out.print("Enter your kick-of chance - ");
                                                 int uc = sc.nextInt();
                                                 System.out.println();
                                                 
                                                 int uc1 =(int)((Math.random()*6)+1);
                                                 System.out.print("Your choice is - " + uc);
                                                 sm1 = uc + uc1;
                                                 System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                 if(uc == 0)
                                                 {
                                                     System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                     l10 = 10;
                                                 }
                                                 if(uc != uc1)
                                                 {
                                                    sm += sm1;
                                                    sm += l10;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + sm1);
                                                 }
                                                 else
                                                    if(uc == uc1)
                                                    {
                                                        gu++;
                                                        if(gu == 1)
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu + " goal");
                                                        else
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu + " goals");
                                                    }
                                                 
                                             }
                                             else
                                             {
                                                 System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + sm + "--" + gc + "-Com");
                                                 System.out.print("Enter your save chance - ");
                                                 int uc = sc.nextInt();
                                                 System.out.println();
                                                 
                                                 int uc1 =(int)((Math.random()*6)+1);
                                                 System.out.print("Your choice is - " + uc);
                                                 sm1 = uc + uc1;
                                                 System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                 if((uc == 0) || (uc > 6))
                                                 {
                                                     for (k1 = 1;k1 == ps;k1++)
                                                     {
                                                         System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                         int psu = sc.nextInt();
                                                         
                                                         int psc =(int)((Math.random()*6)+1);
                                                         if((psu == 0) || (psu > 6))
                                                         {
                                                             ps++;
                                                         }
                                                         if(psu != psc)
                                                         {
                                                             sm1 = psu + psc;
                                                             System.out.println("\t\t\t\t\tThe time counted is : " + sm1); 
                                                         }
                                                         else
                                                            if(psu == psc)
                                                            {
                                                                gc++;
                                                                if(gc == 1)
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + " goal");
                                                                else
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + " goals");
                                                            }
                                                     }
                                                 }
                                                 if(uc != uc1)
                                                 {
                                                    sm += sm1;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + sm1);
                                                 }
                                                 else
                                                    if(uc == uc1)
                                                    {
                                                        gc++;
                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + "goals");
                                                    }
                                             }
                                             
                                         }    
                                         
                                     }while(sm < 90);
                                     int k2,k3,ps1 = 1;
                                     if(gu > gc)
                                     {
                                         System.out.println("Bravo!" + str1 + ",have won this match against Com.\nMan of the Match is " + str2);
                                     }
                                     else
                                        if(gu < gc)
                                        {
                                            System.out.println("Sorry!" + str1 + ",you have lost this match against Com.\nMan of the Match is Computer.");
                                        }
                                        else
                                        {
                                            System.out.println("The match is drawn.");
                                            System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                            int con = sc.nextInt();
                                            
                                            switch(con)
                                            {
                                                case 1 : do
                                                         {
                                                             for(k2 = 1;sm <= 120;k2++)
                                                             {
                                                                 if(k2 % 2 == 1)
                                                                 {
                                                                    int l10 = 0;
                                                                     System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + sm + "--" + gc + "-Com");
                                                                     System.out.print("Enter your kick-of chance - ");
                                                                     int uc = sc.nextInt();
                                                                     System.out.println();
                                                                     
                                                                     int uc1 =(int)((Math.random()*6)+1);
                                                                     System.out.print("Your choice is - " + uc);
                                                                     sm1 = uc + uc1;
                                                                     System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                     if(uc == 0)
                                                                     {
                                                                         System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                         l10 = 10;
                                                                     }
                                                                     if(uc != uc1)
                                                                     {
                                                                        sm += sm1;
                                                                        sm += l10;
                                                                        System.out.println("\t\t\t\t\tThe time counted is : " + sm1);
                                                                     }
                                                                     else
                                                                     if(uc == uc1)
                                                                     {
                                                                        gu++;
                                                                        if(gu == 1)
                                                                            System.out.println("Goal!Good shot " + ti2 + ".You now have hit " + gu + " goal");
                                                                        else
                                                                            System.out.println("Goal!Good shot " + ti2 + ".You now have hit " + gu + " goals");
                                                                     }
                                                                     
                                                                 }
                                                                 else
                                                                 {
                                                                    System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + sm + "--" + gc + "-Com");
                                                                    System.out.print("Enter your save chance - ");
                                                                    int uc = sc.nextInt();
                                                                    System.out.println();
                                                                    
                                                                    int uc1 =(int)((Math.random()*6)+1);
                                                                    System.out.print("Your choice is - " + uc);
                                                                    sm1 = uc + uc1;
                                                                    System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                    if((uc == 0) || (uc > 6))
                                                                    {
                                                                        for (k3 = 1;k3 == ps1;k3++)
                                                                        {
                                                                            System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                            int psu = sc.nextInt();
                                                                            
                                                                            int psc =(int)((Math.random()*6)+1);
                                                                            if((psu == 0) || (psu > 6))
                                                                            {
                                                                                ps1++;
                                                                            }
                                                                            if(psu != psc)
                                                                            {
                                                                                sm1 = psu + psc;
                                                                                System.out.println("\t\t\t\t\tThe time counted is : " + sm1); 
                                                                            }
                                                                            else
                                                                                if((psu + 1 >= psc) || (psu - 1 <= psc))
                                                                                {
                                                                                    gc++;
                                                                                    if(gc == 1)
                                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + " goal");
                                                                                    else
                                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + " goals");
                                                                                }
                                                                        }
                                                                    }
                                                                    if(uc != uc1)
                                                                        {
                                                                            sm += sm1;
                                                                            System.out.println("\t\t\t\t\tThe time counted is : " + sm1);
                                                                        }
                                                                        else
                                                                        if(uc == uc1)
                                                                        {
                                                                            gc++;
                                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc + "goals");
                                                                        }
                                                                  
                                                                    
                                                                  }
                                                                               
                                                             }
                                                         }while(sm <= 120);
                                                         int k4;String kl = "",kn = ""; 
                                                         if(gu > gc)
                                                         {
                                                             System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                                         }
                                                         else
                                                            if(gu < gc)
                                                            {
                                                                System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("The match is drawn");
                                                                System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                                int con1 = sc.nextInt();
                                                                System.out.println();
                                                                switch(con1)
                                                                {
                                                                    case 1 : for(k4 = 1;k4 <= 10;k4++) 
                                                                             {
                                                                                if(k4 % 2 == 1)
                                                                                {
                                                                                    System.out.println(kl + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + "120" + "--" + gc + "-Com" + "\t\t\t\t\t" + kn);
                                                                                    
                                                                                    System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int pc = uc + 1;
                                                                                    int pc1 = uc - 1;
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    
                                                                                    if((uc1 >= pc1) && (uc1 <= pc))
                                                                                    {
                                                                                        kl += "G ";
                                                                                        gu++;
                                                                                        System.out.println("Goal!Good shot " + ti2 + ".");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        kl += "S ";
                                                                                        System.out.println("Poor shot,its saved.");
                                                                                    }
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println(kl + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + "120" + "--" + gc + "-Com" + "\t\t\t\t\t" + kn);
                                                                                    
                                                                                    System.out.print("Enter to save in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    int pc = uc1 + 1;
                                                                                    int pc1 = uc1 - 1;
                                                                                        
                                                                                    if((uc >= pc1) && (uc <= pc))
                                                                                    {
                                                                                        kn += "G ";
                                                                                        gc++;
                                                                                        System.out.println("Poor drive,its a goal");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        kn += "S ";
                                                                                        System.out.println("Saved!Good drive by the " + str1 + "ian goolkeeper");
                                                                                    }
                                                                                
                                                                                }
                                                                             }
                                                                             if(gu > gc)
                                                                             {
                                                                                 System.out.println("Bravo!You have won the match against Com");
                                                                                 System.out.println("Man of the match is " + ti2);
                                                                             }
                                                                             else
                                                                                if(gu < gc)
                                                                                {
                                                                                    System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("The match is drawn");
                                                                                    int op = (int)(Math.random()*2);
                                                                                    if(op == 0)
                                                                                    {
                                                                                        System.out.println("Man of the match is " + ti2);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        System.out.println("Man of the match is Computer");
                                                                                    }
                                                                                    
                                                                                }
                                                                             break;
                                                                             
                                                                    case 2 : int op = (int)(Math.random()*2);
                                                                             if(op == 0)
                                                                             {
                                                                                System.out.println("Man of the match is " + ti2);
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println("Man of the match is Computer");
                                                                             }
                                                                                    
                                                                             break;
                                                                    
                                                                    default : System.out.println("Invalid input");
                                                                              System.exit(0);
                                                                }       
                                                         }
                                                         break;
                                                            
                                                  case 2 : int op = (int)(Math.random()*2);
                                                           if(op == 0)
                                                           {
                                                               System.out.println("Man of the match is " + ti2);
                                                           }
                                                           else
                                                           {
                                                               System.out.println("Man of the match is Computer");
                                                           }
                                                            
                                                            break;
                                                                    
                                                  default : System.out.println("Invalid input");
                                                            System.exit(0);
                                            } 
                                     }
                                     break;
                                     
                            case 2 : do
                                     {
                                         for(k5 = 1;sm2 <= 90;k5++)
                                         {
                                             if(k5 % 2 == 1)
                                             {
                                                 System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + sm2 + "--" + gc1 + "-Com");
                                                 System.out.print("Enter your save chance - ");
                                                 int uc = sc.nextInt();
                                                 System.out.println();
                                                 
                                                 int uc1 =(int)((Math.random()*6)+1);
                                                 System.out.print("Your choice is - " + uc);
                                                 sm3 = uc + uc1;
                                                 System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                 if((uc == 0) || (uc > 6))
                                                 {
                                                     for (k6 = 1;k6 == psi;k6++)
                                                     {
                                                         System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                         int psu = sc.nextInt();
                                                         
                                                         int psc =(int)((Math.random()*6)+1);
                                                         if((psu == 0) || (psu > 6))
                                                         {
                                                             psi++;
                                                         }
                                                         if(psu != psc)
                                                         {
                                                             sm3 = psu + psc;
                                                             System.out.println("\t\t\t\t\tThe time counted is : " + sm3); 
                                                         }
                                                         else
                                                            if(psu == psc)
                                                            {
                                                                gc1++;
                                                                if(gc1 == 1)
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + " goal");
                                                                else
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + " goals");
                                                            }
                                                     }
                                                 }
                                                 if(uc != uc1)
                                                 {
                                                    sm2 += sm3;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + sm3);
                                                 }
                                                 else
                                                    if(uc == uc1)
                                                    {
                                                        gc1++;
                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + "goals");
                                                    }
                                             }
                                             else
                                             {
                                                 int l10 = 0;
                                                 System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + sm2 + "--" + gc1 + "-Com");
                                                 System.out.print("Enter your kick-of chance - ");
                                                 int uc = sc.nextInt();
                                                 System.out.println();
                                                 
                                                 int uc1 =(int)((Math.random()*6)+1);
                                                 System.out.print("Your choice is - " + uc);
                                                 sm3 = uc + uc1;
                                                 System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                 if(uc == 0)
                                                 {
                                                     System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                     l10 = 10;
                                                 }
                                                 if(uc != uc1)
                                                 {
                                                    sm2 += sm3;
                                                    sm2 += l10;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + sm3);
                                                 }
                                                 else
                                                    if(uc == uc1)
                                                    {
                                                        gu1++;
                                                        if(gu1 == 1)
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu1 + " goal");
                                                        else
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu1 + " goals");
                                                    }
                                             }
                                         }
                                     }while(sm2 < 90);
                                     int k7,k8,psi1 = 1;
                                     if(gu1 > gc1)
                                     {
                                         System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                     }
                                     else
                                        if(gu1 < gc1)
                                        {
                                            System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                        }
                                        else
                                        {
                                            System.out.println("The match is drawn.");
                                            System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                            int con = sc.nextInt();
                                            
                                            switch(con)
                                            {
                                                case 1 : do
                                                         {
                                                             for(k7 = 1;sm2 <= 120;k7++)
                                                             {
                                                                 if(k7 % 2 == 1)
                                                                 {
                                                                     System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + sm2 + "--" + gc1 + "-Com");
                                                                     System.out.print("Enter your save chance - ");
                                                                     int uc = sc.nextInt();
                                                                     System.out.println();
                                                                     
                                                                     int uc1 =(int)((Math.random()*6)+1);
                                                                     System.out.print("Your choice is - " + uc);
                                                                     sm3 = uc + uc1;
                                                                     System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                     if((uc == 0) || (uc > 6))
                                                                     {
                                                                         for (k6 = 1;k6 == psi1;k6++)
                                                                         {
                                                                             System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                             int psu = sc.nextInt();
                                                                             
                                                                             int psc =(int)((Math.random()*6)+1);
                                                                             if((psu == 0) || (psu > 6))
                                                                             {
                                                                                 psi1++;
                                                                             }
                                                                             if(psu != psc)
                                                                             {
                                                                                sm3 = psu + psc;
                                                                                System.out.println("\t\t\t\t\tThe time counted is : " + sm3); 
                                                                             }
                                                                             else
                                                                                if(psu == psc)
                                                                                {
                                                                                    gc1++;
                                                                                    if(gc1 == 1)
                                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + " goal");
                                                                                    else
                                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + " goals");
                                                                                }
                                                                         }
                                                                      }
                                                                      if(uc != uc1)
                                                                      {
                                                                          sm2 += sm3;
                                                                          System.out.println("\t\t\t\t\tThe time counted is : " + sm3);
                                                                      }
                                                                      else
                                                                        if(uc == uc1)
                                                                        {
                                                                            gc1++;
                                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc1 + "goals");
                                                                        }
                                                                  }
                                                                  else
                                                                  {
                                                                      int l10 = 0;
                                                                      System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + sm2 + "--" + gc1 + "-Com");
                                                                      System.out.print("Enter your kick-of chance - ");
                                                                      int uc = sc.nextInt();
                                                                      System.out.println();
                                                                      
                                                                      int uc1 =(int)((Math.random()*6)+1);
                                                                      System.out.print("Your choice is - " + uc);
                                                                      sm3 = uc + uc1;
                                                                      System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                      if(uc == 0)
                                                                      {
                                                                          System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                          l10 = 10;
                                                                      }
                                                                      if(uc != uc1)
                                                                      {
                                                                          sm2 += sm3;
                                                                          sm2 += l10;
                                                                          System.out.println("\t\t\t\t\tThe time counted is : " + sm3);
                                                                      }
                                                                      else
                                                                        if(uc == uc1)
                                                                        {
                                                                            gu1++;
                                                                            if(gu1 == 1)
                                                                                System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu1 + " goal");
                                                                            else
                                                                                System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu1 + " goals");
                                                                        }
                                                                  }
                                                             }    
                                                         }while(sm2 < 120);
                                                         int k9;String kl1 = "",kn1 = ""; 
                                                         if(gu1 > gc1)
                                                         {
                                                             System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                                         }
                                                         else
                                                            if(gu1 < gc1)
                                                            {
                                                                System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("The match is drawn");
                                                                System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                                int con1 = sc.nextInt();
                                                                System.out.println();
                                                                switch(con1)
                                                                {
                                                                    case 1 : for(k9 = 1;k9 <= 10;k9++) 
                                                                             {
                                                                                if(k9 % 2 == 1)
                                                                                {
                                                                                    System.out.println(kl1 + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + "120" + "--" + gc1 + "-Com" + "\t\t\t\t\t" + kn1);
                                                                                    
                                                                                    System.out.print("Enter to save in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    int pc = uc1 + 1;
                                                                                    int pc1 = uc1 - 1;
                                                                                        
                                                                                    if((uc >= pc1) && (uc <= pc))
                                                                                    {
                                                                                        kn1 += "G ";
                                                                                        gc1++;
                                                                                        System.out.println("Poor drive,its a goal");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        kn1 += "S ";
                                                                                        System.out.println("Saved!Good drive by the " + str1 + "ian goolkeeper");
                                                                                    }
                                                                                
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println(kl1 + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu1 + "--" + "120" + "--" + gc1 + "-Com" + "\t\t\t\t\t" + kn1);
                                                                                    
                                                                                    System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int pc = uc + 1;
                                                                                    int pc1 = uc - 1;
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    
                                                                                    if((uc1 >= pc1) && (uc1 <= pc))
                                                                                    {
                                                                                        kl1 += "G ";
                                                                                        gu1++;
                                                                                        System.out.println("Goal!Good shot " + ti2 + ".");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        kl1 += "S ";
                                                                                        System.out.println("Poor shot,its saved.");
                                                                                    }
                                                                                }
                                                                             }
                                                                             if(gu1 > gc1)
                                                                             {
                                                                                 System.out.println("Bravo!You have won the match against Com");
                                                                                 System.out.println("Man of the match is " + ti2);
                                                                             }
                                                                             else
                                                                                if(gu1 < gc1)
                                                                                {
                                                                                    System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("The match is drawn");
                                                                                    int op = (int)(Math.random()*2);
                                                                                    if(op == 0)
                                                                                    {
                                                                                        System.out.println("Man of the match is " + ti2);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        System.out.println("Man of the match is Computer");
                                                                                    }
                                                                                    
                                                                                }
                                                                             break;
                                                                             
                                                                    case 2 : int op = (int)(Math.random()*2);
                                                                             if(op == 0)
                                                                             {
                                                                                System.out.println("Man of the match is " + ti2);
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println("Man of the match is Computer");
                                                                             }
                                                                                    
                                                                             break;
                                                                    
                                                                    default : System.out.println("Invalid input");
                                                                              System.exit(0);
                                                                }
                                                            }
                                                         break;
                                                         
                                                case 2 : int op = (int)(Math.random()*2);
                                                         if(op == 0)
                                                         {
                                                            System.out.println("Man of the match is " + ti2);
                                                         }
                                                         else
                                                         {
                                                            System.out.println("Man of the match is Computer");
                                                         }
                                                                                    
                                                         break;         
                                                            
                                                default : System.out.println("Invalid input");
                                                                      System.exit(0);
                                              }
                                         }
                        }
                     }
                     else
                        if(((b == 1) && (b1 == 1)) || ((b == 2) && (b1 == 0)))
                        {
                            int c = (int)(Math.random()*2);
                            if(c == 0)
                            {
                                System.out.println("The computer has elected to safe first");
                                
                                do
                                {
                                    for(l = 1;am <= 90;l++)
                                    {
                                        if(l % 2 == 1)
                                        {
                                            int l10 = 0;
                                            System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu2 + "--" + am + "--" + gc2 + "-Com");
                                            System.out.print("Enter your kick-of chance - ");
                                            int uc = sc.nextInt();
                                            System.out.println();
                                            
                                            int uc1 =(int)((Math.random()*6)+1);
                                            System.out.print("Your choice is - " + uc);
                                            am1 = uc + uc1;
                                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                            if(uc == 0)
                                            {
                                                System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                l10 = 10;
                                            }
                                            if(uc != uc1)
                                            {
                                                am += am1;
                                                am += l10;
                                                System.out.println("\t\t\t\t\tThe time counted is : " + am1);
                                            }
                                            else
                                                if(uc == uc1)
                                                {
                                                    gu2++;
                                                    if(gu == 1)
                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu2 + " goal");
                                                    else
                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu2 + " goals");
                                                }
                                                 
                                        }
                                        else
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu2 + "--" + am + "--" + gc2 + "-Com");
                                            System.out.print("Enter your save chance - ");
                                            int uc = sc.nextInt();
                                            System.out.println();
                                            
                                            int uc1 =(int)((Math.random()*6)+1);
                                            System.out.print("Your choice is - " + uc);
                                            am1 = uc + uc1;
                                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                            if((uc == 0) || (uc > 6))
                                            {
                                                for (l1 = 1;l1 == rs;l1++)
                                                {
                                                    System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                    int psu = sc.nextInt();
                                                    
                                                    int psc =(int)((Math.random()*6)+1);
                                                    if((psu == 0) || (psu > 6))
                                                    {
                                                        rs++;
                                                    }
                                                    if(psu != psc)
                                                    {
                                                        am1 = psu + psc;
                                                        System.out.println("\t\t\t\t\tThe time counted is : " + am1); 
                                                    }
                                                    else
                                                        if(psu == psc)
                                                        {
                                                            gc2++;
                                                            if(gc == 1)
                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + " goal");
                                                            else
                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + " goals");
                                                        }
                                                }
                                            }
                                            if(uc != uc1)
                                            {
                                                am += am1;
                                                System.out.println("\t\t\t\t\tThe time counted is : " + am1);
                                            }
                                            else
                                                if(uc == uc1)
                                                {
                                                    gc2++;
                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + "goals");
                                                }
                                        }
                                             
                                    }    
                                         
                                }while(sm < 90);
                                int l2,l3,rs1 = 1;
                                if(gu2 > gc2)
                                {
                                    System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                }
                                else
                                    if(gu2 < gc2)
                                    {
                                        System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                    }
                                    else
                                    {
                                        System.out.println("The match is drawn.");
                                        System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                        int con = sc.nextInt();
                                        
                                        switch(con)
                                        {
                                            case 1 : do
                                                     {
                                                         for(l2 = 1;am <= 120;l2++)
                                                         {
                                                            if(l2 % 2 == 1)
                                                            {
                                                                int l10 = 0;
                                                                System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu2 + "--" + am + "--" + gc2 + "-Com");
                                                                System.out.print("Enter your kick-of chance - ");
                                                                int uc = sc.nextInt();
                                                                System.out.println();
                                                                
                                                                int uc1 =(int)((Math.random()*6)+1);
                                                                System.out.print("Your choice is - " + uc);
                                                                am1 = uc + uc1;
                                                                System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                if(uc == 0)
                                                                {
                                                                    System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                    l10 = 10;
                                                                }
                                                                if(uc != uc1)
                                                                {
                                                                    am += am1;
                                                                    am += l10;
                                                                    System.out.println("\t\t\t\t\tThe time counted is : " + am1);
                                                                }
                                                                else
                                                                    if(uc == uc1)
                                                                    {
                                                                        gu2++;
                                                                        if(gu2 == 1)
                                                                            System.out.println("Goal!Good shot " + ti2 + ".You now have hit " + gu2 + " goal");
                                                                        else
                                                                            System.out.println("Goal!Good shot " + ti2 + ".You now have hit " + gu2 + " goals");
                                                                    }
                                                                     
                                                            }
                                                            else
                                                            {
                                                                System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu2 + "--" + am + "--" + gc2 + "-Com");
                                                                System.out.print("Enter your save chance - ");
                                                                int uc = sc.nextInt();
                                                                System.out.println();
                                                                    
                                                                int uc1 =(int)((Math.random()*6)+1);
                                                                System.out.print("Your choice is - " + uc);
                                                                am1 = uc + uc1;
                                                                System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                if((uc == 0) || (uc > 6))
                                                                {
                                                                    for (l3 = 1;l3 == rs1;l3++)
                                                                    {
                                                                        System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                        int psu = sc.nextInt();
                                                                        
                                                                        int psc =(int)((Math.random()*6)+1);
                                                                        if((psu == 0) || (psu > 6))
                                                                        {
                                                                            rs1++;
                                                                        }
                                                                        if(psu != psc)
                                                                        {
                                                                            am1 = psu + psc;
                                                                            System.out.println("\t\t\t\t\tThe time counted is : " + am1); 
                                                                        }
                                                                        else
                                                                            if((psu + 1 >= psc) || (psu - 1 <= psc))
                                                                            {
                                                                                gc2++;
                                                                                if(gc == 1)
                                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + " goal");
                                                                                else
                                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + " goals");
                                                                            }
                                                                    }
                                                                }
                                                                if(uc != uc1)
                                                                {
                                                                    am += am1;
                                                                    System.out.println("\t\t\t\t\tThe time counted is : " + am1);
                                                                }
                                                                else
                                                                    if(uc == uc1)
                                                                    {
                                                                        gc2++;
                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc2 + "goals");
                                                                    }  
                                                            }
                                                                               
                                                         }
                                                     }while(am <= 120);
                                                     int l4;String pl = "",pn = ""; 
                                                     if(gu2 > gc2)
                                                     {
                                                        System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                                     }
                                                     else
                                                        if(gu2 < gc2)
                                                        {
                                                            System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                        }
                                                        else
                                                        {
                                                            System.out.println("The match is drawn");
                                                            System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                            int con1 = sc.nextInt();
                                                            System.out.println();
                                                            switch(con1)
                                                            {
                                                                case 1 : for(l4 = 1;l4 <= 10;l4++) 
                                                                         {
                                                                            if(l4 % 2 == 1)
                                                                            {
                                                                                System.out.println(pl + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu2 + "--" + "120" + "--" + gc2 + "-Com" + "\t\t\t\t\t" + pn);
                                                                                
                                                                                System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int pc = uc + 1;
                                                                                int pc1 = uc - 1;
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                
                                                                                if((uc1 >= pc1) && (uc1 <= pc))
                                                                                {
                                                                                    pl += "G ";
                                                                                    gu2++;
                                                                                    System.out.println("Goal!Good shot " + ti2 + ".");
                                                                                }
                                                                                else
                                                                                {
                                                                                    pl += "S ";
                                                                                    System.out.println("Poor shot,its saved.");
                                                                                }
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println(pl + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu + "--" + "120" + "--" + gc2 + "-Com" + "\t\t\t\t\t" + pn);
                                                                                
                                                                                System.out.print("Enter to save in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                int pc = uc1 + 1;
                                                                                int pc1 = uc1 - 1;
                                                                                
                                                                                if((uc >= pc1) && (uc <= pc))
                                                                                {
                                                                                    pn += "G ";
                                                                                    gc2++;
                                                                                    System.out.println("Poor drive,its a goal");
                                                                                }
                                                                                else
                                                                                {
                                                                                    pn += "S ";
                                                                                    System.out.println("Saved!Good drive by the " + str1 + "ian goolkeeper");
                                                                                }
                                                                                
                                                                            }
                                                                         }
                                                                         if(gu2 > gc2)
                                                                         {
                                                                            System.out.println("Bravo!You have won the match against Com");
                                                                            System.out.println("Man of the match is " + ti2);
                                                                         }
                                                                         else
                                                                            if(gu2 < gc2)
                                                                            {
                                                                                System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println("The match is drawn");
                                                                                int op = (int)(Math.random()*2);
                                                                                if(op == 0)
                                                                                {
                                                                                    System.out.println("Man of the match is " + ti2);
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("Man of the match is Computer");
                                                                                }
                                                                                    
                                                                            }
                                                                         break;
                                                                             
                                                                case 2 : int op = (int)(Math.random()*2);
                                                                         if(op == 0)
                                                                         {
                                                                            System.out.println("Man of the match is " + ti2);
                                                                         }
                                                                         else
                                                                         {
                                                                            System.out.println("Man of the match is Computer");
                                                                         }
                                                                                    
                                                                         break;
                                                                    
                                                                default : System.out.println("Invalid input");
                                                                          System.exit(0);
                                                             }       
                                                         }
                                                     break;
                                                            
                                            case 2 : int op = (int)(Math.random()*2);
                                                     if(op == 0)
                                                     {
                                                        System.out.println("Man of the match is " + ti2);
                                                     }
                                                     else
                                                     {
                                                        System.out.println("Man of the match is Computer");
                                                     }
                                                                                    
                                                     break;
                                                                    
                                            default : System.out.println("Invalid input");
                                                      System.exit(0);
                                         } 
                                     }
                                     
                            }
                            else
                            {
                                System.out.println("The computer has elected to kick-of first");
                                do
                                {
                                    for(l5 = 1;am2 <= 90;l5++)
                                    {
                                        if(l5 % 2 == 1)
                                        {
                                            System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + am2 + "--" + gc3 + "-Com");
                                            System.out.print("Enter your save chance - ");
                                            int uc = sc.nextInt();
                                            System.out.println();
                                            
                                            int uc1 =(int)((Math.random()*6)+1);
                                            System.out.print("Your choice is - " + uc);
                                            am3 = uc + uc1;
                                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                            if((uc == 0) || (uc > 6))
                                            {
                                                for (l6 = 1;l6 == rsi;l6++)
                                                {
                                                    System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                    int psu = sc.nextInt();
                                                    
                                                    int psc =(int)((Math.random()*6)+1);
                                                    if((psu == 0) || (psu > 6))
                                                    {
                                                        rsi++;
                                                    }
                                                    if(psu != psc)
                                                    {
                                                        am3 = psu + psc;
                                                        System.out.println("\t\t\t\t\tThe time counted is : " + am3); 
                                                    }
                                                    else
                                                        if(psu == psc)
                                                        {
                                                            gc3++;
                                                            if(gc3 == 1)
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + " goal");
                                                            else
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + " goals");
                                                        }
                                                }
                                            }
                                            if(uc != uc1)
                                            {
                                                am2 += am3;
                                                System.out.println("\t\t\t\t\tThe time counted is : " + am3);
                                            }
                                            else
                                                if(uc == uc1)
                                                {
                                                    gc3++;
                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + "goals");
                                                }
                                         }
                                         else
                                         {
                                            int l10 = 0;
                                            System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + am2 + "--" + gc3 + "-Com");
                                            System.out.print("Enter your kick-of chance - ");
                                            int uc = sc.nextInt();
                                            System.out.println();
                                            
                                            int uc1 =(int)((Math.random()*6)+1);
                                            System.out.print("Your choice is - " + uc);
                                            am3 = uc + uc1;
                                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                            if(uc == 0)
                                            {
                                                System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                l10 = 10;
                                            }
                                            if(uc != uc1)
                                            {
                                                am2 += am3;
                                                am2 += l10;
                                                System.out.println("\t\t\t\t\tThe time counted is : " + am3);
                                            }
                                            else
                                                if(uc == uc1)
                                                {
                                                    gu3++;
                                                    if(gu3 == 1)
                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu3 + " goal");
                                                    else
                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu3 + " goals");
                                                }
                                          }
                                    }
                                 }while(am2 < 90);
                                 int l7,l8,rsi1 = 1;
                                 if(gu3 > gc3)
                                 {
                                    System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                 }
                                 else
                                    if(gu3 < gc3)
                                    {
                                        System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                    }
                                    else
                                    {
                                        System.out.println("The match is drawn.");
                                        System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                        int con = sc.nextInt();
                                        
                                        switch(con)
                                        {
                                            case 1 : do
                                                     {
                                                        for(l7 = 1;am2 <= 120;l7++)
                                                        {
                                                            if(l7 % 2 == 1)
                                                            {
                                                                System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + am2 + "--" + gc2 + "-Com");
                                                                System.out.print("Enter your save chance - ");
                                                                int uc = sc.nextInt();
                                                                System.out.println();
                                                                
                                                                int uc1 =(int)((Math.random()*6)+1);
                                                                System.out.print("Your choice is - " + uc);
                                                                am3 = uc + uc1;
                                                                System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                if((uc == 0) || (uc > 6))
                                                                {
                                                                    for (l6 = 1;l6 == rsi1;l6++)
                                                                    {
                                                                        System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                        int psu = sc.nextInt();
                                                                        
                                                                        int psc =(int)((Math.random()*6)+1);
                                                                        if((psu == 0) || (psu > 6))
                                                                        {
                                                                            rsi1++;
                                                                        }
                                                                        if(psu != psc)
                                                                        {
                                                                            am3 = psu + psc;
                                                                            System.out.println("\t\t\t\t\tThe time counted is : " + am3); 
                                                                        }
                                                                        else
                                                                            if(psu == psc)
                                                                            {
                                                                                gc3++;
                                                                                if(gc3 == 1)
                                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + " goal");
                                                                                else
                                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + " goals");
                                                                            }
                                                                     }
                                                                  }
                                                                  if(uc != uc1)
                                                                  {
                                                                    am2 += am3;
                                                                    System.out.println("\t\t\t\t\tThe time counted is : " + am3);
                                                                  }
                                                                  else
                                                                    if(uc == uc1)
                                                                    {
                                                                        gc3++;
                                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc3 + "goals");
                                                                    }
                                                             }
                                                             else
                                                             {
                                                                int l10 = 0;
                                                                System.out.println("\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + am2 + "--" + gc3 + "-Com");
                                                                System.out.print("Enter your kick-of chance - ");
                                                                int uc = sc.nextInt();
                                                                System.out.println();
                                                                
                                                                int uc1 =(int)((Math.random()*6)+1);
                                                                System.out.print("Your choice is - " + uc);
                                                                am3 = uc + uc1;
                                                                System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                                if(uc == 0)
                                                                {
                                                                    System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                    l10 = 10;
                                                                }
                                                                if(uc != uc1)
                                                                {
                                                                    am2 += am3;
                                                                    am2 += l10;
                                                                    System.out.println("\t\t\t\t\tThe time counted is : " + am3);
                                                                }
                                                                else
                                                                    if(uc == uc1)
                                                                    {
                                                                        gu3++;
                                                                        if(gu3 == 1)
                                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu3 + " goal");
                                                                        else
                                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti2 + ".You now have hit " + gu3 + " goals");
                                                                    }
                                                              }
                                                         }    
                                                      }while(am2 < 120);
                                                      int l9;String pl1 = "",pn1 = ""; 
                                                      if(gu3 > gc3)
                                                      {
                                                        System.out.println("Bravo!" + str1 + " has won this match against Com.\nMan of the Match is " + str2);
                                                      }
                                                      else
                                                        if(gu3 < gc3)
                                                        {
                                                            System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                        }
                                                        else
                                                        {
                                                            System.out.println("The match is drawn");
                                                            System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                            int con1 = sc.nextInt();
                                                            System.out.println();
                                                            switch(con1)
                                                            {
                                                                case 1 : for(l9 = 1;l9 <= 10;l9++) 
                                                                         {
                                                                            if(l9 % 2 == 1)
                                                                            {
                                                                                System.out.println(pl1 + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + "120" + "--" + gc3 + "-Com" + "\t\t\t\t\t" + pn1);
                                                                                
                                                                                System.out.print("Enter to save in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                int pc = uc1 + 1;
                                                                                int pc1 = uc1 - 1;
                                                                                
                                                                                if((uc >= pc1) && (uc <= pc))
                                                                                {
                                                                                    pn1 += "G ";
                                                                                    gc3++;
                                                                                    System.out.println("Poor drive,its a goal");
                                                                                }
                                                                                else
                                                                                {
                                                                                    pn1 += "S ";
                                                                                    System.out.println("Saved!Good drive by the " + str1 + "ian goolkeeper");
                                                                                }
                                                                                
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println(pl1 + "\t\t\t\t\t\t\t\t" + st1 + "-" + gu3 + "--" + "120" + "--" + gc3 + "-Com" + "\t\t\t\t\t" + pn1);
                                                                                
                                                                                System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int pc = uc + 1;
                                                                                int pc1 = uc - 1;
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                
                                                                                if((uc1 >= pc1) && (uc1 <= pc))
                                                                                {
                                                                                    pl1 += "G ";
                                                                                    gu3++;
                                                                                    System.out.println("Goal!Good shot " + ti2 + ".");
                                                                                }
                                                                                else
                                                                                {
                                                                                    pl1 += "S ";
                                                                                    System.out.println("Poor shot,its saved.");
                                                                                }
                                                                             }
                                                                          }
                                                                          if(gu3 > gc3)
                                                                          {
                                                                            System.out.println("Bravo!You have won the match against Com");
                                                                            System.out.println("Man of the match is " + ti2);
                                                                          }
                                                                          else
                                                                            if(gu3 < gc3)
                                                                            {
                                                                                System.out.println("Sorry!" + str1 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println("The match is drawn");
                                                                                int op = (int)(Math.random()*2);
                                                                                if(op == 0)
                                                                                {
                                                                                    System.out.println("Man of the match is " + ti2);
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("Man of the match is Computer");
                                                                                }
                                                                                    
                                                                            }
                                                                         break;
                                                                             
                                                                case 2 : int op = (int)(Math.random()*2);
                                                                         if(op == 0)
                                                                         {
                                                                            System.out.println("Man of the match is " + ti2);
                                                                         }
                                                                         else
                                                                         {
                                                                            System.out.println("Man of the match is Computer");
                                                                         }
                                                                                    
                                                                         break;
                                                                    
                                                                default : System.out.println("Invalid input");
                                                                              System.exit(0);
                                                             }
                                                         }
                                                       break;
                                                            
                                             default : System.out.println("Invalid input");
                                                       System.exit(0);
                                                        }
                                         }
                            }
                        }
                        else
                        {
                            System.out.println("Invalid input");
                        }
                     break;
                     
            case 2 : System.out.print("");
                     String wstr1 = sc.nextLine();
                     
                     System.out.print("Enter your team : ");
                     String str3 = sc.nextLine();

                     System.out.print("Enter your player : ");
                     String str4 = sc.nextLine();
                     
                     int i1;
                     String st3 = "";
                     
                     for(i1 = 0;i1 <= 2;i1++)
                     {
                         st3 += str3.charAt(i1);
                     }
                     
                     int sn2 = str4.length();
                     int ai1,ti1 = 0,sp1 = 0;
                     char st4;char tt1 = ' ';
                     for(ai1 = 0;ai1 < sn2;ai1++)
                     {
                         st4 = str4.charAt(ai1);
                         if(st4 == tt1)
                         {
                             sp1++;
                             ti1 = ai1;
                         }
                     }
                     
                     int j1;ti1++;
                     String gi1 = "";
                     for(j1 = ti1;j1 < sn2;j1++)
                     {
                         gi1 += str4.charAt(j1);
                     }
                     String ti3;
                     if(sp1 > 0)
                     {
                         ti3 = gi1;
                     }
                     else
                     {
                         ti3 = str4;
                     }
                     System.out.print("Time for toss\nEnter,\n1 to choose heads\n2 to choose tails\nEnter your choice : ");
                     int b2 = sc.nextInt();
                     
                     int b3 =(int)(Math.random()*2);
                     int gu4 = 0,gc4 = 0,tm = 0,m1,qs = 1,tm1 = 0,tm2 = 0,tm3 = 0;
                     int gu5 = 0,gc5 = 0,tm4 = 0,m,qs2 = 1,tm5 = 0,tm6 = 0,tm7 = 0;
                     int gu6 = 0,gc6 = 0,fm = 0,n1,qs4 = 1,fm1 = 0,fm2 = 0,fm3 = 0;
                     int gu7 = 0,gc7 = 0,fm4 = 0,n,qs6 = 1,fm5 = 0,fm6 = 0,fm7 = 0;
                     
                     if(((b2 == 1) || (b3 == 0))||((b2 == 2) || (b3 == 1)))
                     {
                        System.out.print("You have won the toss against COM.\nEnter,\n1 to kick-of\n2 to safe\nEnter your choice : ");
                        int c = sc.nextInt();
                        
                        switch(c)
                        {
                            case 1 : do
                                     {
                                        int l10 = 0;
                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + tm + "--" + gc4 + "-Com");
                                        System.out.print("Enter your kick-of chance - ");
                                        int uc = sc.nextInt();
                                        System.out.println();
                                        
                                        int uc1 =(int)((Math.random()*6)+1);
                                        System.out.print("Your choice is - " + uc);
                                        tm1 = uc + uc1;
                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                        if(uc == 0)
                                        {
                                            System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                            l10 = 10;
                                        }
                                        if(uc != uc1)
                                        {
                                            tm += tm1;
                                            tm += l10;
                                            System.out.println("\t\t\t\t\tThe time counted is : " + tm1);
                                        }
                                        else
                                            if(uc == uc1)
                                            {
                                                gu4++;
                                                if(gu4 == 1)
                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu4 + " goal");
                                                else
                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu4 + " goals");
                                            }
                                     }while(tm <= 90);
                                     System.out.println();
                                     System.out.println("The computer now needs " + (gu4 + 1) + " goals to win");
                                     System.out.println();
                                     
                                     do
                                     {
                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + tm2 + "--" + gc4 + "-Com");
                                        System.out.print("Enter your save chance - ");
                                        int uc = sc.nextInt();
                                        System.out.println();
                                        
                                        int uc1 =(int)((Math.random()*6)+1);
                                        System.out.print("Your choice is - " + uc);
                                        tm3 = uc + uc1;
                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                        if((uc == 0) || (uc > 6))
                                        {
                                            for (m1 = 1;m1 == qs;m1++)
                                            {
                                                System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                int psu = sc.nextInt();
                                                
                                                int psc =(int)((Math.random()*6)+1);
                                                if((psu == 0) || (psu > 6))
                                                {
                                                    qs++;
                                                }
                                                if(psu != psc)
                                                {
                                                    tm3 = psu + psc;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + tm3); 
                                                }
                                                else
                                                    if(psu == psc)
                                                    {
                                                        gc4++;
                                                        if(gc4 == 1)
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + " goal");
                                                        else
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + " goals");
                                                    }
                                            }
                                        }
                                        if(uc != uc1)
                                        {
                                            tm2 += tm3;
                                            System.out.println("\t\t\t\t\tThe time counted is : " + tm3);
                                        }
                                        else
                                            if(uc == uc1)
                                            {
                                                gc4++;
                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + "goals");
                                            }
                                     }while(tm2 <= 90);
                                     int m3,qs1 = 1;
                                     if(gu4 > gc4)
                                     {
                                         System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                     }
                                     else
                                        if(gu4 < gc4)
                                        {
                                            System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                        }
                                        else
                                        {
                                            System.out.println("The match is drawn.");
                                            System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                            int con = sc.nextInt();
                                            
                                            switch(con)
                                            {
                                                case 1 : do
                                                         {
                                                             int l10 = 0;
                                                             System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + tm + "--" + gc4 + "-Com");
                                                             System.out.print("Enter your kick-of chance - ");
                                                             int uc = sc.nextInt();
                                                             System.out.println();
                                                             
                                                             int uc1 =(int)((Math.random()*6)+1);
                                                             System.out.print("Your choice is - " + uc);
                                                             tm1 = uc + uc1;
                                                             System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                             if(uc == 0)
                                                             {
                                                                 System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                 l10 = 10;
                                                             }
                                                             if(uc != uc1)
                                                             {
                                                                 tm += tm1;
                                                                 tm += l10;
                                                                 System.out.println("\t\t\t\t\tThe time counted is : " + tm1);
                                                             }
                                                             else
                                                                if(uc == uc1)
                                                                {
                                                                    gu4++;
                                                                    if(gu4 == 1)
                                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu4 + " goal");
                                                                    else
                                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu4 + " goals");
                                                                }
                                                         }while(tm <= 120);
                                                         System.out.println();
                                                         System.out.println("The computer now needs " + (gu4 + 1) + " goals to win");
                                                         System.out.println();
                                     
                                                         do
                                                         {
                                                             System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + tm2 + "--" + gc4 + "-Com");
                                                             System.out.print("Enter your save chance - ");
                                                             int uc = sc.nextInt();
                                                             System.out.println();
                                                             
                                                             int uc1 =(int)((Math.random()*6)+1);
                                                             System.out.print("Your choice is - " + uc);
                                                             tm3 = uc + uc1;
                                                             System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                             if((uc == 0) || (uc > 6))
                                                             {
                                                                 for (m3 = 1;m3 == qs1;m3++)
                                                                 {
                                                                     System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                     int psu = sc.nextInt();
                                                                     
                                                                     int psc =(int)((Math.random()*6)+1);
                                                                     if((psu == 0) || (psu > 6))
                                                                     {
                                                                         qs1++;
                                                                     }
                                                                     if(psu != psc)
                                                                     {
                                                                         tm3 = psu + psc;
                                                                         System.out.println("\t\t\t\t\tThe time counted is : " + tm3); 
                                                                     }
                                                                     else
                                                                        if(psu == psc)
                                                                        {
                                                                            gc4++;
                                                                            if(gc4 == 1)
                                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + " goal");
                                                                            else
                                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + " goals");
                                                                        }
                                                                 }
                                                             }
                                                             if(uc != uc1)
                                                             {
                                                                 tm2 += tm3;
                                                                 System.out.println("\t\t\t\t\tThe time counted is : " + tm3);
                                                             }
                                                             else
                                                                if(uc == uc1)
                                                                {
                                                                    gc4++;
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc4 + "goals");
                                                                }
                                                         }while(tm2 <= 120);
                                                         int m4;String ml = "",mn = ""; 
                                                         if(gu4 > gc4)
                                                         {
                                                             System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                                         }
                                                         else
                                                            if(gu4 < gc4)
                                                            {
                                                                System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("The match is drawn");
                                                                System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                                int con1 = sc.nextInt();
                                                                System.out.println();
                                                                switch(con1)
                                                                {
                                                                    case 1 : for(m4 = 1;m4 <= 10;m4++) 
                                                                             {
                                                                                if(m4 % 2 == 1)
                                                                                {
                                                                                    System.out.println(ml + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + "120" + "--" + gc4 + "-Com" + "\t\t\t\t\t" + mn);
                                                                                    
                                                                                    System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int pc = uc + 1;
                                                                                    int pc1 = uc - 1;
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    
                                                                                    if((uc1 >= pc1) && (uc1 <= pc))
                                                                                    {
                                                                                        ml += "G ";
                                                                                        gu4++;
                                                                                        System.out.println("Goal!Good shot " + ti3 + ".");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        ml += "S ";
                                                                                        System.out.println("Poor shot,its saved.");
                                                                                    }
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println(ml + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu4 + "--" + "120" + "--" + gc4 + "-Com" + "\t\t\t\t\t" + mn);
                                                                                    
                                                                                    System.out.print("Enter to save in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    int pc = uc1 + 1;
                                                                                    int pc1 = uc1 - 1;
                                                                                        
                                                                                    if((uc >= pc1) && (uc <= pc))
                                                                                    {
                                                                                        mn += "G ";
                                                                                        gc4++;
                                                                                        System.out.println("Poor drive,its a goal");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        mn += "S ";
                                                                                        System.out.println("Saved!Good drive by the " + str3 + "ian goolkeeper");
                                                                                    }
                                                                                
                                                                                }
                                                                             }
                                                                             if(gu4 > gc4)
                                                                             {
                                                                                 System.out.println("Bravo!You have won the match against Com");
                                                                                 System.out.println("Man of the match is " + ti3);
                                                                             }
                                                                             else
                                                                                if(gu4 < gc4)
                                                                                {
                                                                                    System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("The match is drawn");
                                                                                    int op = (int)(Math.random()*2);
                                                                                    if(op == 0)
                                                                                    {
                                                                                        System.out.println("Man of the match is " + ti3);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        System.out.println("Man of the match is Computer");
                                                                                    }
                                                                                    
                                                                                }
                                                                             break;
                                                                             
                                                                    case 2 : int op = (int)(Math.random()*2);
                                                                             if(op == 0)
                                                                             {
                                                                                System.out.println("Man of the match is " + ti3);
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println("Man of the match is Computer");
                                                                             }
                                                                                    
                                                                             break;
                                                                    
                                                                    default : System.out.println("Invalid input");
                                                                              System.exit(0);
                                                                }       
                                                            }
                                                            break;
                                                            
                                                         case 2 : int op = (int)(Math.random()*2);
                                                                  if(op == 0)
                                                                  {
                                                                    System.out.println("Man of the match is " + ti3);
                                                                  }
                                                                  else
                                                                  {
                                                                    System.out.println("Man of the match is Computer");
                                                                  }
                                                                                    
                                                                  break;
                                                                    
                                                         default : System.out.println("Invalid input");
                                                                   System.exit(0);
                                                                
                                                            
                                            }
                                        }
                                     break;
                                     
                            case 2 : do
                                     {
                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + tm4 + "--" + gc5 + "-Com");
                                        System.out.print("Enter your save chance - ");
                                        int uc = sc.nextInt();
                                        System.out.println();
                                        
                                        int uc1 =(int)((Math.random()*6)+1);
                                        System.out.print("Your choice is - " + uc);
                                        tm5 = uc + uc1;
                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                        if((uc == 0) || (uc > 6))
                                        {
                                            for (m = 1;m == qs2;m++)
                                            {
                                                System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                int psu = sc.nextInt();
                                                
                                                int psc =(int)((Math.random()*6)+1);
                                                if((psu == 0) || (psu > 6))
                                                {
                                                    qs2++;
                                                }
                                                if(psu != psc)
                                                {
                                                    tm5 = psu + psc;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + tm5); 
                                                }
                                                else
                                                    if(psu == psc)
                                                    {
                                                        gc5++;
                                                        if(gc5 == 1)
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + " goal");
                                                        else
                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + " goals");
                                                    }
                                            }
                                        }
                                        if(uc != uc1)
                                        {
                                            tm4 += tm5;
                                            System.out.println("\t\t\t\t\tThe time counted is : " + tm5);
                                        }
                                        else
                                            if(uc == uc1)
                                            {
                                                gc5++;
                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + "goals");
                                            }
                                     }while(tm4 <= 90);
                                     System.out.println();
                                     System.out.println("You need " + (gc5 + 1) + " goals to win");
                                     System.out.println();
                                     
                                     do
                                     {
                                        int l10 = 0;
                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + tm6 + "--" + gc5 + "-Com");
                                        System.out.print("Enter your kick-of chance - ");
                                        int uc = sc.nextInt();
                                        System.out.println();
                                        
                                        int uc1 =(int)((Math.random()*6)+1);
                                        System.out.print("Your choice is - " + uc);
                                        tm7 = uc + uc1;
                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                        if(uc == 0)
                                        {
                                            System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                            l10 = 10;
                                        }
                                        if(uc != uc1)
                                        {
                                            tm6 += tm7;
                                            tm6 += l10;
                                            System.out.println("\t\t\t\t\tThe time counted is : " + tm7);
                                        }
                                        else
                                            if(uc == uc1)
                                            {
                                                gu5++;
                                                if(gu5 == 1)
                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu5 + " goal");
                                                else
                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu5 + " goals");
                                            }
                                     }while(tm6 <= 90);
                                     int m2,qs3 = 1;
                                     if(gu5 > gc5)
                                     {
                                         System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                     }
                                     else
                                        if(gu5 < gc5)
                                        {
                                            System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                        }
                                        else
                                        {
                                            System.out.println("The match is drawn.");
                                            System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                            int con = sc.nextInt();
                                            
                                            switch(con)
                                            {
                                                case 1 : do
                                                         {
                                                             System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + tm4 + "--" + gc5 + "-Com");
                                                             System.out.print("Enter your save chance - ");
                                                             int uc = sc.nextInt();
                                                             System.out.println();
                                        
                                                             int uc1 =(int)((Math.random()*6)+1);
                                                             System.out.print("Your choice is - " + uc);
                                                             tm5 = uc + uc1;
                                                             System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                             if((uc == 0) || (uc > 6))
                                                             {
                                                                 for (m2 = 1;m2 == qs3;m2++)
                                                                 {
                                                                     System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                     int psu = sc.nextInt();
                                                                     
                                                                     int psc =(int)((Math.random()*6)+1);
                                                                     if((psu == 0) || (psu > 6))
                                                                     {
                                                                         qs3++;
                                                                     }
                                                                     if(psu != psc)
                                                                     {
                                                                        tm5 = psu + psc;
                                                                        System.out.println("\t\t\t\t\tThe time counted is : " + tm5); 
                                                                     }
                                                                     else
                                                                        if(psu == psc)
                                                                        {
                                                                            gc5++;
                                                                            if(gc5 == 1)
                                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + " goal");
                                                                            else
                                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + " goals");
                                                                        }
                                                                 }
                                                             }       
                                                             if(uc != uc1)
                                                             {
                                                                 tm4 += tm5;
                                                                 System.out.println("\t\t\t\t\tThe time counted is : " + tm5);
                                                             }
                                                             else
                                                                if(uc == uc1)
                                                                {
                                                                    gc5++;
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc5 + "goals");
                                                                }
                                                         }while(tm4 <= 120);
                                                         System.out.println();
                                                         System.out.println("You need " + (gc5 + 1) + " goals to win");
                                                         System.out.println();
                                                         
                                                         do
                                                         {
                                                             int l10 = 0;
                                                             System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + tm6 + "--" + gc5 + "-Com");
                                                             System.out.print("Enter your kick-of chance - ");
                                                             int uc = sc.nextInt();
                                                             System.out.println();
                                        
                                                             int uc1 =(int)((Math.random()*6)+1);
                                                             System.out.print("Your choice is - " + uc);
                                                             tm7 = uc + uc1;
                                                             System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                             if(uc == 0)
                                                             {
                                                                 System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                                 l10 = 10;
                                                             }
                                                             if(uc != uc1)
                                                             {
                                                                 tm6 += tm7;
                                                                 tm6 += l10;
                                                                 System.out.println("\t\t\t\t\tThe time counted is : " + tm7);
                                                             }
                                                             else
                                                                if(uc == uc1)
                                                                {
                                                                    gu5++;
                                                                    if(gu5 == 1)
                                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu5 + " goal");
                                                                    else
                                                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu5 + " goals");
                                                                }
                                                         }while(tm6 <= 120);
                                                         int m5;String ml1 = "",mn1 = ""; 
                                                         if(gu5 > gc5)
                                                         {
                                                             System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                                         }
                                                         else
                                                            if(gu5 < gc5)
                                                            {
                                                                System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("The match is drawn");
                                                                System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                                int con1 = sc.nextInt();
                                                                System.out.println();
                                                                switch(con1)
                                                                {
                                                                    case 1 : for(m5 = 1;m5 <= 10;m5++) 
                                                                             {
                                                                                if(m5 % 2 == 1)
                                                                                {
                                                                                    System.out.println(ml1 + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + "120" + "--" + gc5 + "-Com" + "\t\t\t\t\t" + mn1);
                                                                                    
                                                                                    System.out.print("Enter to save in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    int pc = uc1 + 1;
                                                                                    int pc1 = uc1 - 1;
                                                                                        
                                                                                    if((uc >= pc1) && (uc <= pc))
                                                                                    {
                                                                                        mn1 += "G ";
                                                                                        gc5++;
                                                                                        System.out.println("Poor drive,its a goal");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        mn1 += "S ";
                                                                                        System.out.println("Saved!Good drive by the " + str3 + "ian goolkeeper");
                                                                                    }
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println(ml1 + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu5 + "--" + "120" + "--" + gc5 + "-Com" + "\t\t\t\t\t" + mn1);
                                                                                    
                                                                                    System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                    int uc = sc.nextInt();
                                                                                    int pc = uc + 1;
                                                                                    int pc1 = uc - 1;
                                                                                    int uc1 = (int)((Math.random()*6)+1);
                                                                                    
                                                                                    if((uc1 >= pc1) && (uc1 <= pc))
                                                                                    {
                                                                                        ml1 += "G ";
                                                                                        gu5++;
                                                                                        System.out.println("Goal!Good shot " + ti3 + ".");
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        ml1 += "S ";
                                                                                        System.out.println("Poor shot,its saved.");
                                                                                    }
                                                                                }
                                                                                
                                                                             }
                                                                             if(gu5 > gc5)
                                                                             {
                                                                                 System.out.println("Bravo!You have won the match against Com");
                                                                                 System.out.println("Man of the match is " + ti3);
                                                                             }
                                                                             else
                                                                                if(gu5 < gc5)
                                                                                {
                                                                                    System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("The match is drawn");
                                                                                    int op = (int)(Math.random()*2);
                                                                                    if(op == 0)
                                                                                    {
                                                                                        System.out.println("Man of the match is " + ti3);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        System.out.println("Man of the match is Computer");
                                                                                    }
                                                                                    
                                                                                }
                                                                             break;
                                                                             
                                                                    case 2 : int op = (int)(Math.random()*2);
                                                                             if(op == 0)
                                                                             {
                                                                                System.out.println("Man of the match is " + ti3);
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println("Man of the match is Computer");
                                                                             }
                                                                                    
                                                                             break;
                                                                    
                                                                    default : System.out.println("Invalid input");
                                                                              System.exit(0);
                                                                }       
                                                            }
                                                            break;
                                                            
                                                         case 2 : int op = (int)(Math.random()*2);
                                                                  if(op == 0)
                                                                  {
                                                                    System.out.println("Man of the match is " + ti3);
                                                                  }
                                                                  else
                                                                  {
                                                                    System.out.println("Man of the match is Computer");
                                                                  }
                                                                                    
                                                                  break;
                                                                    
                                                         default : System.out.println("Invalid input");
                                                                   System.exit(0);
                                            }
                                        }
                                     break;
                            
                             default : System.out.println("Invalid input");
                                       System.exit(0);         
                        }
                     }
                     else
                        if(((b2 == 1) && (b3== 1)) || ((b2 == 2) && (b3 == 0)))
                        {
                            int c = (int)(Math.random()*2);
                            if(c == 0)
                            {
                                System.out.println("The computer has elected to safe first");
                                
                                do
                                {
                                    int l10 = 0;
                                    System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + fm + "--" + gc6 + "-Com");
                                    System.out.print("Enter your kick-of chance - ");
                                    int uc = sc.nextInt();
                                    System.out.println();
                                    
                                    int uc1 =(int)((Math.random()*6)+1);
                                    System.out.print("Your choice is - " + uc);
                                    fm1 = uc + uc1;
                                    System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                    if(uc == 0)
                                    {
                                        System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                        l10 = 10;
                                    }
                                    if(uc != uc1)
                                    {
                                        fm += fm1;
                                        fm += l10;
                                        System.out.println("\t\t\t\t\tThe time counted is : " + fm1);
                                    }
                                    else
                                        if(uc == uc1)
                                        {
                                            gu6++;
                                            if(gu4 == 1)
                                                System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu6 + " goal");
                                            else
                                                System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu6 + " goals");
                                        }
                                }while(fm <= 90);
                                System.out.println();
                                System.out.println("The computer now needs " + (gu6 + 1) + " goals to win");
                                System.out.println();
                                
                                do
                                {
                                    System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + fm2 + "--" + gc6 + "-Com");
                                    System.out.print("Enter your save chance - ");
                                    int uc = sc.nextInt();
                                    System.out.println();
                                    
                                    int uc1 =(int)((Math.random()*6)+1);
                                    System.out.print("Your choice is - " + uc);
                                    fm3 = uc + uc1;
                                    System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                    if((uc == 0) || (uc > 6))
                                    {
                                        for (n1 = 1;n1 == qs4;n1++)
                                        {
                                            System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                            int psu = sc.nextInt();
                                            
                                            int psc =(int)((Math.random()*6)+1);
                                            if((psu == 0) || (psu > 6))
                                            {
                                                qs4++;
                                            }
                                            if(psu != psc)
                                            {
                                                fm3 = psu + psc;
                                                System.out.println("\t\t\t\t\tThe time counted is : " + fm3); 
                                            }
                                            else
                                                if(psu == psc)
                                                {
                                                    gc6++;
                                                    if(gc6 == 1)
                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + " goal");
                                                    else
                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + " goals");
                                                }
                                         }
                                     }
                                     if(uc != uc1)
                                     {
                                        fm2 += fm3;
                                        System.out.println("\t\t\t\t\tThe time counted is : " + fm3);
                                     }
                                     else
                                        if(uc == uc1)
                                        {
                                            gc6++;
                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + "goals");
                                        }
                                  }while(fm2 <= 90);
                                  int n3,qs5 = 1;
                                  if(gu6 > gc6)
                                  {
                                    System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                  }
                                  else
                                    if(gu6 < gc6)
                                    {
                                        System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                    }
                                    else
                                    {
                                        System.out.println("The match is drawn.");
                                        System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                        int con = sc.nextInt();
                                        
                                        switch(con)
                                        {
                                            case 1 : do
                                                     {
                                                        int l10 = 0;
                                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + fm + "--" + gc6 + "-Com");
                                                        System.out.print("Enter your kick-of chance - ");
                                                        int uc = sc.nextInt();
                                                        System.out.println();
                                                        
                                                        int uc1 =(int)((Math.random()*6)+1);
                                                        System.out.print("Your choice is - " + uc);
                                                        fm1 = uc + uc1;
                                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                        if(uc == 0)
                                                        {
                                                            System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                            l10 = 10;
                                                        }
                                                        if(uc != uc1)
                                                        {
                                                            fm += fm1;
                                                            fm += l10;
                                                            System.out.println("\t\t\t\t\tThe time counted is : " + fm1);
                                                        }
                                                        else
                                                            if(uc == uc1)
                                                            {
                                                                gu6++;
                                                                if(gu6 == 1)
                                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu6 + " goal");
                                                                else
                                                                    System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu6 + " goals");
                                                            }
                                                      }while(fm <= 120);
                                                      System.out.println();
                                                      System.out.println("The computer now needs " + (gu6 + 1) + " goals to win");
                                                      System.out.println();
                                                      
                                                      do
                                                      {
                                                        System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + fm2 + "--" + gc6 + "-Com");
                                                        System.out.print("Enter your save chance - ");
                                                        int uc = sc.nextInt();
                                                        System.out.println();
                                                        
                                                        int uc1 =(int)((Math.random()*6)+1);
                                                        System.out.print("Your choice is - " + uc);
                                                        fm3 = uc + uc1;
                                                        System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                        if((uc == 0) || (uc > 6))
                                                        {
                                                            for (n3 = 1;n3 == qs5;n3++)
                                                            {
                                                                System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                                int psu = sc.nextInt();
                                                                
                                                                int psc =(int)((Math.random()*6)+1);
                                                                if((psu == 0) || (psu > 6))
                                                                {
                                                                    qs5++;
                                                                }
                                                                if(psu != psc)
                                                                {
                                                                    fm3 = psu + psc;
                                                                    System.out.println("\t\t\t\t\tThe time counted is : " + fm3); 
                                                                }
                                                                else
                                                                    if(psu == psc)
                                                                    {
                                                                        gc6++;
                                                                        if(gc6 == 1)
                                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + " goal");
                                                                        else
                                                                            System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + " goals");
                                                                    }
                                                             }
                                                         }
                                                         if(uc != uc1)
                                                         {
                                                            fm2 += fm3;
                                                            System.out.println("\t\t\t\t\tThe time counted is : " + fm3);
                                                         }
                                                         else
                                                            if(uc == uc1)
                                                            {
                                                                gc6++;
                                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc6 + "goals");
                                                            }
                                                       }while(fm2 <= 120);
                                                       int n4;String nl = "",nn = ""; 
                                                       if(gu6 > gc6)
                                                       {
                                                          System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                                       }
                                                       else
                                                          if(gu6 < gc6)
                                                          {
                                                            System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                          }
                                                          else
                                                          {
                                                            System.out.println("The match is drawn");
                                                            System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                            int con1 = sc.nextInt();
                                                            System.out.println();
                                                            switch(con1)
                                                            {
                                                                case 1 : for(n4 = 1;n4 <= 10;n4++) 
                                                                         {
                                                                            if(n4 % 2 == 1)
                                                                            {
                                                                                System.out.println(nl + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + "120" + "--" + gc6 + "-Com" + "\t\t\t\t\t" + nn);
                                                                                
                                                                                System.out.print("Enter to kick-of in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int pc = uc + 1;
                                                                                int pc1 = uc - 1;
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                
                                                                                if((uc1 >= pc1) && (uc1 <= pc))
                                                                                {
                                                                                    nl += "G ";
                                                                                    gu6++;
                                                                                    System.out.println("Goal!Good shot " + ti3 + ".");
                                                                                }
                                                                                else
                                                                                {
                                                                                    nl += "S ";
                                                                                    System.out.println("Poor shot,its saved.");
                                                                                }
                                                                             }
                                                                             else
                                                                             {
                                                                                System.out.println(nl + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu6 + "--" + "120" + "--" + gc6 + "-Com" + "\t\t\t\t\t" + nn);
                                                                                
                                                                                System.out.print("Enter to save in the penalty chance : ");
                                                                                int uc = sc.nextInt();
                                                                                int uc1 = (int)((Math.random()*6)+1);
                                                                                int pc = uc1 + 1;
                                                                                int pc1 = uc1 - 1;
                                                                                
                                                                                if((uc >= pc1) && (uc <= pc))
                                                                                {
                                                                                    nn += "G ";
                                                                                    gc6++;
                                                                                    System.out.println("Poor drive,its a goal");
                                                                                }
                                                                                else
                                                                                {
                                                                                    nn += "S ";
                                                                                    System.out.println("Saved!Good drive by the " + str3 + "ian goolkeeper");
                                                                                }
                                                                                
                                                                              }
                                                                          }
                                                                          if(gu6 > gc6)
                                                                          {
                                                                            System.out.println("Bravo!You have won the match against Com");
                                                                            System.out.println("Man of the match is " + ti3);
                                                                          }
                                                                          else
                                                                            if(gu6 < gc6)
                                                                            {
                                                                                System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println("The match is drawn");
                                                                                int op = (int)(Math.random()*2);
                                                                                if(op == 0)
                                                                                {
                                                                                    System.out.println("Man of the match is " + ti3);
                                                                                }
                                                                                else
                                                                                {
                                                                                    System.out.println("Man of the match is Computer");
                                                                                }
                                                                                    
                                                                             }
                                                                         break;
                                                                             
                                                                case 2 : int op = (int)(Math.random()*2);
                                                                         if(op == 0)
                                                                         {
                                                                             System.out.println("Man of the match is " + ti3);
                                                                         }
                                                                         else
                                                                         {
                                                                            System.out.println("Man of the match is Computer");
                                                                         }
                                                                                    
                                                                         break;
                                                                    
                                                               default : System.out.println("Invalid input");
                                                                         System.exit(0);
                                                             }       
                                                          }
                                                     break;
                                                            
                                            case 2 : int op = (int)(Math.random()*2);
                                                     if(op == 0)
                                                     {
                                                        System.out.println("Man of the match is " + ti3);
                                                     }
                                                     else
                                                     {
                                                        System.out.println("Man of the match is Computer");
                                                     }
                                                     
                                                     break;
                                                                    
                                           default : System.out.println("Invalid input");
                                                     System.exit(0);
                            }
                        }
                    }
                    else
                    {
                        System.out.println("The computer has elected to kick-of first");
                        
                        do
                        {
                            System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + fm4 + "--" + gc7 + "-Com");
                            System.out.print("Enter your save chance - ");
                            int uc = sc.nextInt();
                            System.out.println();
                            
                            int uc1 =(int)((Math.random()*6)+1);
                            System.out.print("Your choice is - " + uc);
                            fm5 = uc + uc1;
                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                            if((uc == 0) || (uc > 6))
                            {
                                for (n = 1;n == qs6;n++)
                                {
                                    System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                    int psu = sc.nextInt();
                                    
                                    int psc =(int)((Math.random()*6)+1);
                                    if((psu == 0) || (psu > 6))
                                    {
                                        qs6++;
                                    }
                                    if(psu != psc)
                                    {
                                        fm5 = psu + psc;
                                        System.out.println("\t\t\t\t\tThe time counted is : " + fm5); 
                                    }
                                    else
                                        if(psu == psc)
                                        {
                                            gc7++;
                                            if(gc7 == 1)
                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + " goal");
                                            else
                                                System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + " goals");
                                        }
                                }
                            }
                            if(uc != uc1)
                            {
                                fm4 += fm5;
                                System.out.println("\t\t\t\t\tThe time counted is : " + fm5);
                            }
                            else
                                if(uc == uc1)
                                {
                                    gc7++;
                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + "goals");
                                }
                        }while(fm4 <= 90);
                        System.out.println();
                        System.out.println("You need " + (gc7 + 1) + " goals to win");
                        System.out.println();
                        
                        do
                        {
                            int l10 = 0;
                            System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + fm6 + "--" + gc7 + "-Com");
                            System.out.print("Enter your kick-of chance - ");
                            int uc = sc.nextInt();
                            System.out.println();
                                
                            int uc1 =(int)((Math.random()*6)+1);
                            System.out.print("Your choice is - " + uc);
                            fm7 = uc + uc1;
                            System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                            if(uc == 0)
                            {
                                System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                l10 = 10;
                            }
                            if(uc != uc1)
                            {
                                fm6 += fm7;
                                fm6 += l10;
                                System.out.println("\t\t\t\t\tThe time counted is : " + fm7);
                            }
                            else
                                if(uc == uc1)
                                {
                                    gu7++;
                                    if(gu7 == 1)
                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu7 + " goal");
                                    else
                                        System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu7 + " goals");
                                }
                         }while(fm6 <= 90);
                         int n2,qs7 = 1;
                         if(gu7 > gc7)
                         {
                             System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                         }
                         else
                            if(gu7 < gc7)
                            {
                                System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                            }
                            else
                            {
                                System.out.println("The match is drawn.");
                                System.out.print("Enter,\n1 to continue to the extra time of 30 minutes\n2 to finish the game over here.\nEnter your choice : ");
                                int con = sc.nextInt();
                                
                                switch(con)
                                {
                                    case 1 : do
                                             {
                                                 System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + fm4 + "--" + gc7 + "-Com");
                                                 System.out.print("Enter your save chance - ");
                                                 int uc = sc.nextInt();
                                                 System.out.println();
                                                 
                                                 int uc1 =(int)((Math.random()*6)+1);
                                                 System.out.print("Your choice is - " + uc);
                                                 fm5 = uc + uc1;
                                                 System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                 if((uc == 0) || (uc > 6))
                                                 {
                                                     for (n2 = 1;n2 == qs7;n2++)
                                                     {
                                                         System.out.print("\nSince,you have given a choice which is more than six or less than 1,Therefore you have to save a penalty that the computer will shoot.Enter your choice to save the penalty : ");
                                                         int psu = sc.nextInt();
                                                         
                                                         int psc =(int)((Math.random()*6)+1);
                                                         if((psu == 0) || (psu > 6))
                                                         {
                                                             qs7++;
                                                         }
                                                         if(psu != psc)
                                                         {
                                                             fm5 = psu + psc;
                                                             System.out.println("\t\t\t\t\tThe time counted is : " + fm5); 
                                                         }
                                                         else
                                                            if(psu == psc)
                                                            {
                                                                gc7++;
                                                                if(gc7 == 1)
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + " goal");
                                                                else
                                                                    System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + " goals");
                                                            }
                                                     }
                                                 }       
                                                 if(uc != uc1)
                                                 {
                                                     fm4 += fm5;
                                                     System.out.println("\t\t\t\t\tThe time counted is : " + fm5);
                                                 }
                                                 else
                                                    if(uc == uc1)
                                                    {
                                                        gc7++;
                                                        System.out.println("\t\t\t\t\tGoal!The computer now have hit " + gc7 + "goals");
                                                    }
                                             }while(fm4 <= 120);
                                             System.out.println();
                                             System.out.println("You need " + (gc7 + 1) + " goals to win");
                                             System.out.println();
                                             
                                             do
                                             {
                                                int l10 = 0;
                                                System.out.println("\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + fm6 + "--" + gc7 + "-Com");
                                                System.out.print("Enter your kick-of chance - ");
                                                int uc = sc.nextInt();
                                                System.out.println();
                                                
                                                int uc1 =(int)((Math.random()*6)+1);
                                                System.out.print("Your choice is - " + uc);
                                                fm7 = uc + uc1;
                                                System.out.print("\t\t\t\t\tCOM's choice is - " + uc1);
                                                if(uc == 0)
                                                {
                                                    System.out.println("\nYou are going to loose 10 mins since you have given a chance which 0");
                                                    l10 = 10;
                                                }
                                                if(uc != uc1)
                                                {
                                                    fm6 += fm7;
                                                    fm6 += l10;
                                                    System.out.println("\t\t\t\t\tThe time counted is : " + fm7);
                                                }
                                                else
                                                    if(uc == uc1)
                                                    {
                                                        gu7++;
                                                        if(gu7 == 1)
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu7 + " goal");
                                                        else
                                                            System.out.println("\t\t\t\tGoal!Good shot " + ti3 + ".You now have hit " + gu7 + " goals");
                                                    }
                                             }while(fm6 <= 120);
                                             int n5;String nl1 = "",nn1 = ""; 
                                             if(gu7 > gc7)
                                             {
                                                System.out.println("Bravo!" + str3 + " has won this match against Com.\nMan of the Match is " + str4);
                                             }
                                             else
                                                if(gu7 < gc7)
                                                {
                                                    System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                }
                                                else
                                                {
                                                    System.out.println("The match is drawn");
                                                    System.out.print("Enter,\n1 to continue with the penalty shoot outs\n2 to finish the game over here\nEnter your choice : ");
                                                    int con1 = sc.nextInt();
                                                    System.out.println();
                                                    switch(con1)
                                                    {
                                                        case 1 : for(n5 = 1;n5 <= 10;n5++) 
                                                                 {
                                                                     if(n5 % 2 == 1)
                                                                     {
                                                                         System.out.println(nl1 + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + "120" + "--" + gc7 + "-Com" + "\t\t\t\t\t" + nn1);
                                                                         
                                                                         System.out.print("Enter to save in the penalty chance : ");
                                                                         int uc = sc.nextInt();
                                                                         int uc1 = (int)((Math.random()*6)+1);
                                                                         int pc = uc1 + 1;
                                                                         int pc1 = uc1 - 1;
                                                                         
                                                                         if((uc >= pc1) && (uc <= pc))
                                                                         {
                                                                             nn1 += "G ";
                                                                             gc7++;
                                                                             System.out.println("Poor drive,its a goal");
                                                                         }
                                                                         else
                                                                         {
                                                                             nn1 += "S ";
                                                                             System.out.println("Saved!Good drive by the " + str3 + "ian goolkeeper");
                                                                         }
                                                                     }
                                                                     else
                                                                     {
                                                                         System.out.println(nl1 + "\t\t\t\t\t\t\t\t" + st3 + "-" + gu7 + "--" + "120" + "--" + gc7 + "-Com" + "\t\t\t\t\t" + nn1);
                                                                         
                                                                         System.out.print("Enter to kick-of in the penalty chance : ");
                                                                         int uc = sc.nextInt();
                                                                         int pc = uc + 1;
                                                                         int pc1 = uc - 1;
                                                                         int uc1 = (int)((Math.random()*6)+1);
                                                                         
                                                                         if((uc1 >= pc1) && (uc1 <= pc))
                                                                         {
                                                                             nl1 += "G ";
                                                                             gu7++;
                                                                             System.out.println("Goal!Good shot " + ti3 + ".");
                                                                         }
                                                                         else
                                                                         {
                                                                             nl1 += "S ";
                                                                             System.out.println("Poor shot,its saved.");
                                                                         }
                                                                     }
                                                                                
                                                                 }
                                                                 if(gu7 > gc7)
                                                                 {
                                                                     System.out.println("Bravo!You have won the match against Com");
                                                                     System.out.println("Man of the match is " + ti3);
                                                                 }
                                                                 else
                                                                    if(gu7 < gc7)
                                                                    {
                                                                        System.out.println("Sorry!" + str3 + " has lost this match against Com.\nMan of the Match is Computer.");
                                                                    }
                                                                    else
                                                                    {
                                                                        System.out.println("The match is drawn");
                                                                        int op = (int)(Math.random()*2);
                                                                        if(op == 0)
                                                                        {
                                                                            System.out.println("Man of the match is " + ti3);
                                                                        }
                                                                        else
                                                                        {
                                                                            System.out.println("Man of the match is Computer");
                                                                        }
                                                                        
                                                                    }
                                                                break;
                                                             
                                                       case 2 : int op = (int)(Math.random()*2);
                                                                if(op == 0)
                                                                {
                                                                    System.out.println("Man of the match is " + ti3);
                                                                }
                                                                else
                                                                {
                                                                    System.out.println("Man of the match is Computer");
                                                                }
                                                             
                                                                break;
                                                             
                                                      default : System.out.println("Invalid input");
                                                                System.exit(0);
                                                     }       
                                                  }
                                             break;
                                             
                                    case 2 : int op = (int)(Math.random()*2);
                                             if(op == 0)
                                             {
                                                System.out.println("Man of the match is " + ti3);
                                             }
                                             else
                                             {
                                                System.out.println("Man of the match is Computer");
                                             }
                                             
                                             break;
                                                                    
                                   default : System.out.println("Invalid input");
                                             System.exit(0);
                                 }
                         }
                             
                    }
                }
                    break;
                    
             default : System.out.println("Wrong Choice\n");
                       System.exit(0);
        }                         
    }
}        