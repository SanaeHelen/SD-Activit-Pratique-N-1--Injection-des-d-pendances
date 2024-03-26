# SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1
1. Créer l'interface IDao avec une méthode getDate

   
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/83f90c08-c366-4908-8051-49a375dcc54b)

3. Créer une implémentation de cette interface
   

   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/f3cc7957-1e68-475a-80d9-347e4a122cff)




5. Créer l'interface IMetier avec une méthode calcul


   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/ef8fd271-acfe-4adc-b76e-de3a2afc2cb4)

7. Créer une implémentation de cette interface en utilisant le couplage faible
   

   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/3fcf1d8f-2108-4ddf-b565-cd2e8dfa6afd)


9. Faire l'injection des dépendances :
  a. Par instanciation statique


    ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/4d6ad9a1-6ca5-4932-a30c-598566275116)



   Output : 


   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/4d10be4f-e4ad-490e-a3f7-6fa126900f69)



  b. Par instanciation dynamique


   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/61b0f2a3-d6cd-48f1-8360-077591ba27ff)


   fichier config.txt : 

![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/b4f3dd95-65fc-4d6c-adec-e0cbb3ce5521)


  Output : 


  ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/d8899e47-b880-4a4d-8415-d961fda62b76)


   c. En utilisant le Framework Spring
      
- Version XML
       
   Fichier config.xml:
              ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/e199bd39-ef83-46d7-aab8-a06b058f0245)
              
   Presentation Avec Spring Xml : 
             ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/5ce09a02-344d-48ac-8b23-87a19043d3d8)
             
  Output :
  
  ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/0d0fd215-2c10-4056-9f49-2430d2a4cc83)

- Version annotations :
     
   ![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/95440154-0b07-4400-bceb-d6991d9a6fe3)


Output : 

![image](https://github.com/SanaeHelen/SD-Activit-Pratique-N-1--Injection-des-d-pendances-P1/assets/136022070/a78609e9-8bea-4c44-add9-4f35dc815a7d)

       
