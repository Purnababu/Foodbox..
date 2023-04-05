import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, findIndex } from 'rxjs';

import { Food } from './food';



@Injectable({
  providedIn: 'root'
})
export class FoodService {
        private baseUl="http://localhost:8081/api/items"
  constructor(private http:HttpClient) { }
                   
      

         
           getitems():Observable<Food[]>{
            return this.http.get<Food[]>(`${this.baseUl}`);
           }
       }


         
       additems():Observable<Food[]>{
        return this.http.post<Food[]>(`${this.baseUl}`, findIndex);
       }
   }

   



      
      

   
    
   
  
   

