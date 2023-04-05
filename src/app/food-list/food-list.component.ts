import { Component } from '@angular/core';
import { Food } from '../food';

import { FoodService } from '../food.service';

@Component({
  selector: 'app-food-list',
  templateUrl: './food-list.component.html',
  styleUrls: ['./food-list.component.css']
})
export class FoodListComponent {
      fss:Food[]=[];
  constructor(private se:FoodService){}

     ngOnInit():void{
           this.fooditemslist();
     }

     fooditemslist(){
      this.se.getitems().subscribe(data=>{
        this.fss=data;
      })
     }

}
