
import java.util.*;
class Fifa_Programe
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter,\n1 to play against computer\n2 to play in multiplayer\nEnter your choice : ");
        int a = sc.nextInt();
        
        int st = (int)(Math.random()*18);
        switch(st)
        {
            case 0 : System.out.println("Welcome,to Eracana Maracana Stadium");
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
                     System.out.print(str1);
                     System.out.print("Enter '1' for Heads and '2' for Tails : ");
                     int b = sc.nextInt();
                     
                     int t = (int)(Math.random()*2);
                     
                     int i,z = 0,l = 0,v = 0;
                     
                     int j1,z1 = 0,l1 = 0,v1 = 0;
                     
                     if ((t == 0) && (b == 2))
                     {
                         System.out.println("Computer has elected to kick-of"); 
                         
                         i = 0;
                         do  
                         {
                            System.out.print("Enter your chance choice : ");
                            int f = sc.nextInt();
                            
                            int f1 = (int)((Math.random()*6)+1);
                                          
                            if ((f == 0) || (f > 6))
                            {
                                System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                System.exit(0);
                            }
                                          
                            if (f1 == f)
                            {
                                z = (z + 1);
                                System.out.println("Goal!Computer now leads by " + z + " goals");
                                System.out.println();
                            }
                            else
                            {
                                v = (f + f1);
                                l = l + v;
                            }
                                i = i + v;
                         }while(i <= 90);
                                      
                            System.out.println("You need " + (z + 1) + " goals to win");
                            System.out.println();
                                      
                            j1 = 0;
                            do
                            {
                                System.out.print("Enter your chance choice : ");
                                int f = sc.nextInt();
                                          
                                int f1 = (int)((Math.random()*6)+1);
                                          
                                if ((f == 0) || (f > 6))
                                {
                                    System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                    System.exit(0);
                                }
                                          
                                if (f1 == f)
                                {
                                    z1 = (z1 + 1);
                                    System.out.println("Goal!You now lead by " + z1 + " goals");
                                    System.out.println();
                                }
                                else
                                {
                                    v1 = (f + f1);
                                    l1 = l1 + v1;
                                }
                                    j1 = j1 + v1;
                            }while(j1 <= 90);
                                      
                                if (z > z1)
                                {
                                    System.out.println("Sorry;The computer has won this match");
                                    System.exit(0);
                                }
                                else
                                    if (z < z1)
                                    {
                                        System.out.println("Bravo;You have won this match");
                                        System.out.println("Man of the match : " + str2);
                                        System.exit(0);
                                    }
                                    else
                                    {
                                        System.out.println("This match is drawn");
                                        System.out.println("Man of the match : " + str2);
                                        System.exit(0);
                                    }      
                     }
                     
                     int j2,z2 = 0,l2 = 0,v2 = 0;
                     
                     int j3,z3 = 0,l3 = 0,v3 = 0;
                     
                     if ((t == 1) && (b == 1))
                     {
                         System.out.println("Computer has elected to safe"); 
                         
                         j2 = 0;
                            do
                            {
                                System.out.print("Enter your chance choice : ");
                                int f = sc.nextInt();
                                          
                                int f1 = (int)((Math.random()*6)+1);
                                          
                                if ((f == 0) || (f > 6))
                                {
                                    System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                    System.exit(0);
                                }
                                          
                                if (f1 == f)
                                {
                                    z2 = (z2 + 1);
                                    System.out.println("Goal!You now lead by " + z2 + " goals");
                                    System.out.println();
                                }
                                else
                                {
                                    v2 = (f + f1);
                                    l2 = l2 + v2;
                                }
                                    j2 = j2 + v2;
                            }while(j2 <= 90);
                            
                            System.out.println("The computer now needs  " + (z2 + 1) + " goals to win");
                            System.out.println();
                                      
                            j3 = 0;
                            do
                            {
                                System.out.print("Enter your chance choice : ");
                                int f = sc.nextInt();
                                          
                                int f1 = (int)((Math.random()*6)+1);
                                          
                                if ((f == 0) || (f > 6))
                                {
                                    System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                    System.exit(0);
                                }
                                          
                                if (f1 == f)
                                {
                                    z3 = (z3 + 1);
                                    System.out.println("Goal!The computer now leads by " + z3 + " goals");
                                    System.out.println();
                                }
                                else
                                {
                                    v3 = (f + f1);
                                    l3 = l3 + v3;
                                }
                                    j3 = j3 + v3;
                            }while(j3 <= 90);
                            
                            if (z3 > z2)
                                {
                                    System.out.println("Sorry;The computer has won this match");
                                    System.exit(0);
                                }
                                else
                                    if (z3 < z2)
                                    {
                                        System.out.println("Bravo;You have won this match");
                                        System.out.println("Man of the match : " + str2);
                                        System.exit(0);
                                    }
                                    else
                                    {
                                        System.out.println("This match is drawn");
                                        System.out.println("Man of the match : " + str2);
                                        System.exit(0);
                                    }
                     }
                     
                     int i1,zz = 0,zl = 0,zv = 0;
                     
                     int zj1,zz1 = 0,zl1 = 0,zv1 = 0;
                     
                     int zj2,zz2 = 0,zl2 = 0,zv2 = 0;
                     
                     int zj3,zz3 = 0,zl3 = 0,zv3 = 0;
                     
                     if (((t == 0) && (b == 1)) || ((t == 1) && (b == 2)))
                     {
                         System.out.print("Enter\n1 to Safe\n2 to Kick-of\nEnter your choice : ");
                         int u = sc.nextInt();
                         
                         switch(u)
                         {
                             case 1 : i1 = 0;
                                      do  
                                      {
                                          System.out.print("Enter your chance choice : ");
                                          int f = sc.nextInt();
                            
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              zz = (zz + 1);
                                              System.out.println("Goal!Computer now leads by " + zz + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              zv = (f + f1);
                                              zl = zl + zv;
                                          }
                                          i1 = i1 + zv;
                                      }while(i1 <= 90);
                                      
                                      System.out.println("You need " + (zz + 1) + " goals to win");
                                      System.out.println();
                                      
                                      zj1 = 0;
                                      do
                                      {
                                          System.out.print("Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              zz1 = (zz1 + 1);
                                              System.out.println("Goal!You now lead by " + zz1 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              zv1 = (f + f1);
                                              zl1 = zl1 + zv1;
                                          }
                                          zj1 = zj1 + zv1;
                                      }while(zj1 <= 90);
                                      
                                      if (zz > zz1)
                                      {
                                          System.out.println("Sorry;The computer has won this match");
                                          System.exit(0);
                                      }
                                      else
                                        if (zz < zz1)
                                        {
                                            System.out.println("Bravo;You have won this match");
                                            System.out.println("Man of the match : " + str2);
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("This match is drawn");
                                            System.out.println("Man of the match : " + str2);
                                            System.exit(0);
                                        }
                                      break;
                                      
                                      
                             case 2 : zj2 = 0;
                                      do
                                      {
                                          System.out.print("Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              zz2 = (zz2 + 1);
                                              System.out.println("Goal!You now lead by " + zz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              zv2 = (f + f1);
                                              zl2 = zl2 + zv2;
                                          }
                                          zj2 = zj2 + zv2;
                                      }while(zj2 <= 90);
                            
                                      System.out.println("The computer now needs  " + (zz2 + 1) + " goals to win");
                                      System.out.println();
                                      
                                      zj3 = 0;
                                      do
                                      {
                                          System.out.print("Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              zz3 = (zz3 + 1);
                                              System.out.println("Goal!The computer now leads by " + zz3 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                            zv3 = (f + f1);
                                            zl3 = zl3 + zv3;
                                          }
                                          zj3 = zj3 + zv3;
                                      }while(zj3 <= 90);
                            
                                        if (zz3 > zz2)
                                        {
                                            System.out.println("Sorry;The computer has won this match");
                                            System.exit(0);
                                        }
                                        else
                                            if (zz3 < zz2)
                                            {
                                                System.out.println("Bravo;You have won this match");
                                                System.out.println("Man of the match : " + str2);
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println("This match is drawn");
                                                System.out.println("Man of the match : " + str2);
                                                System.exit(0);
                                            }
                                      break;
                                      
                             default : System.out.println("Invalid input");         
                         }
                     }
                     break;
                     
            case 2 : System.out.print("");
                     String wstr1 = sc.nextLine();
                     
                     System.out.print("P1,Enter your team : ");
                     String str3 = sc.nextLine();
                     System.out.print("P1,Enter your player : ");
                     String str4 = sc.nextLine();
                     
                     System.out.print("P2,Enter your team : ");
                     String str5 = sc.nextLine();
                     System.out.print("P2,Enter your player : ");
                     String str6 = sc.nextLine();
                     
                     System.out.print(str4 + " wins.\nEnter,\n1 to choose heads\n2 to choose tails\nEnter your choice : ");
                     int u = sc.nextInt();
                     
                     int y = (int)(Math.random()*2);
                     
                     int uzj2,uzz2 = 0,uzl2 = 0,uzv2 = 0;
                     int ozj2,ozz2 = 0,ozl2 = 0,ozv2 = 0;
                     
                     int pzj2,pzz2 = 0,pzl2 = 0,pzv2 = 0;
                     int qzj2,qzz2 = 0,qzl2 = 0,qzv2 = 0;
                     
                     if (((u == 1) && (y == 0)) || ((u == 2) && (y == 1)))
                     {
                         System.out.print("Enter,\n1 to safe\n2 to kick-of\nEnter your choice : ");
                         int r = sc.nextInt();
                         
                         switch(r)
                         {
                             case 1 : uzj2 = 0;
                                      do
                                      {
                                          System.out.print(str6 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              uzz2 = (uzz2 + 1);
                                              System.out.println("Goal!" + str6 + " now leads by " + uzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              uzv2 = (f + f1);
                                              uzl2 = uzl2 + uzv2;
                                          }
                                          uzj2 = uzj2 + uzv2;
                                      }while(uzj2 <= 90);
                            
                                      System.out.println(str4 + " now needs " + (uzz2 + 1) + " goals to win");
                                      System.out.println();
                             
                                      ozj2 = 0;
                                      do
                                      {
                                          System.out.print(str4 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              ozz2 = (ozz2 + 1);
                                              System.out.println("Goal!" + str4 + " now leads by " + ozz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              ozv2 = (f + f1);
                                              ozl2 = ozl2 + ozv2;
                                          }
                                          ozj2 = ozj2 + ozv2;
                                      }while(ozj2 <= 90);
                                      
                                      if (ozz2 > uzz2)
                                      {
                                        System.out.println("Bravo;" + str4 + " have won this match");
                                        System.out.println("Man of the match : " + str4);
                                        System.exit(0);
                                      }
                                      else
                                        if (ozz2 < uzz2)
                                        {
                                            System.out.println("Bravo;" + str5 + " have won this match");
                                            System.out.println("Man of the match : " + str6);
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("This match is drawn");
                                            int q = (int)(Math.random()*2);
                                                
                                            if (q == 0)
                                            {
                                                System.out.println("Man of the match : " + str4);
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println("Man of the match : " + str6);
                                                System.exit(0);
                                            }
                                        }
                                      break;
                                      
                             case 2 : pzj2 = 0;
                                      do
                                      {
                                          System.out.print(str4 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              pzz2 = (pzz2 + 1);
                                              System.out.println("Goal!" + str4 + " now leads by " + pzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              pzv2 = (f + f1);
                                              pzl2 = pzl2 + pzv2;
                                          }
                                          pzj2 = pzj2 + pzv2;
                                      }while(pzj2 <= 90);
                                      
                                      System.out.println(str6 + " now needs " + (pzz2 + 1) + " goals to win");
                                      System.out.println();
                                      
                                      qzj2 = 0;
                                      do
                                      {
                                          System.out.print(str6 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              qzz2 = (qzz2 + 1);
                                              System.out.println("Goal!" + str6 + " now leads by " + uzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              qzv2 = (f + f1);
                                              qzl2 = qzl2 + qzv2;
                                          }
                                          qzj2 = qzj2 + qzv2;
                                      }while(qzj2 <= 90);
                                      
                                      if (pzz2 > qzz2)
                                      {
                                        System.out.println("Bravo;" + str4 + " have won this match");
                                        System.out.println("Man of the match : " + str4);
                                        System.exit(0);
                                      }
                                      else
                                        if (pzz2 < qzz2)
                                        {
                                            System.out.println("Bravo;" + str5 + " have won this match");
                                            System.out.println("Man of the match : " + str6);
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("This match is drawn");
                                            int q = (int)(Math.random()*2);
                                                
                                            if (q == 1)
                                            {
                                                System.out.println("Man of the match : " + str4);
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println("Man of the match : " + str6);
                                                System.exit(0);
                                            }
                                        }
                                      break;
                                      
                             default : System.out.println("Invalid input");         
                         }
                     }
                     else
                     {
                         int tzj2,tzz2 = 0,tzl2 = 0,tzv2 = 0;
                         int fzj2,fzz2 = 0,fzl2 = 0,fzv2 = 0;
                     
                         int mzj2,mzz2 = 0,mzl2 = 0,mzv2 = 0;
                         int nzj2,nzz2 = 0,nzl2 = 0,nzv2 = 0;
                         
                         System.out.print(str5 + " wins.\nEnter,\n1 to kick-of\n2 to safe\nEnter your choice : ");
                         int r = sc.nextInt();
                         
                         switch(r)
                         {
                             case 1 : tzj2 = 0;
                                      do
                                      {
                                          System.out.print(str6 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              tzz2 = (tzz2 + 1);
                                              System.out.println("Goal!" + str6 + " now leads by " + tzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              tzv2 = (f + f1);
                                              tzl2 = tzl2 + tzv2;
                                          }
                                          tzj2 = tzj2 + tzv2;
                                      }while(tzj2 <= 90);
                            
                                      System.out.println(str4 + " now needs " + (tzz2 + 1) + " goals to win");
                                      System.out.println();
                             
                                      fzj2 = 0;
                                      do
                                      {
                                          System.out.print(str4 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              fzz2 = (fzz2 + 1);
                                              System.out.println("Goal!" + str4 + " now leads by " + fzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              fzv2 = (f + f1);
                                              fzl2 = fzl2 + fzv2;
                                          }
                                          fzj2 = fzj2 + fzv2;
                                      }while(fzj2 <= 90);
                                      
                                      if (fzz2 > tzz2)
                                      {
                                        System.out.println("Bravo;" + str4 + " have won this match");
                                        System.out.println("Man of the match : " + str4);
                                        System.exit(0);
                                      }
                                      else
                                        if (fzz2 < tzz2)
                                        {
                                            System.out.println("Bravo;" + str5 + " have won this match");
                                            System.out.println("Man of the match : " + str6);
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("This match is drawn");
                                            int q = (int)(Math.random()*2);
                                                
                                            if (q == 0)
                                            {
                                                System.out.println("Man of the match : " + str4);
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println("Man of the match : " + str6);
                                                System.exit(0);
                                            }
                                        }
                                      break;
                                      
                             case 2 : mzj2 = 0;
                                      do
                                      {
                                          System.out.print(str4 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              mzz2 = (mzz2 + 1);
                                              System.out.println("Goal!" + str4 + " now leads by " + mzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              mzv2 = (f + f1);
                                              mzl2 = mzl2 + mzv2;
                                          }
                                          mzj2 = mzj2 + mzv2;
                                      }while(mzj2 <= 90);
                                      
                                      System.out.println(str6 + " now needs " + (mzz2 + 1) + " goals to win");
                                      System.out.println();
                                      
                                      nzj2 = 0;
                                      do
                                      {
                                          System.out.print(str6 + ",Enter your chance choice : ");
                                          int f = sc.nextInt();
                                          
                                          int f1 = (int)((Math.random()*6)+1);
                                          
                                          if ((f == 0) || (f > 6))
                                          {
                                              System.out.println("You cannot enter zero nor you can enter chance which is more than six;Go and try again");
                                              System.exit(0);
                                          }
                                          
                                          if (f1 == f)
                                          {
                                              nzz2 = (nzz2 + 1);
                                              System.out.println("Goal!" + str6 + " now leads by " + nzz2 + " goals");
                                              System.out.println();
                                          }
                                          else
                                          {
                                              nzv2 = (f + f1);
                                              nzl2 = nzl2 + nzv2;
                                          }
                                          nzj2 = nzj2 + nzv2;
                                      }while(nzj2 <= 90);
                                      
                                      if (mzz2 > nzz2)
                                      {
                                        System.out.println("Bravo;You have won this match");
                                        System.out.println("Man of the match : " + str4);
                                        System.exit(0);
                                      }
                                      else
                                        if (mzz2 < nzz2)
                                        {
                                            System.out.println("Bravo;You have won this match");
                                            System.out.println("Man of the match : " + str6);
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("This match is drawn");
                                            int q = (int)(Math.random()*2);
                                                
                                            if (q == 1)
                                            {
                                                System.out.println("Man of the match : " + str4);
                                                System.exit(0);
                                            }
                                            else
                                            {
                                                System.out.println("Man of the match : " + str6);
                                                System.exit(0);
                                            }
                                        }
                                      break;
                                      
                             default : System.out.println("Invalid input");         
                         }
                     }
                     
            default : System.out.println("Invalid input");         
        }
    }
}
