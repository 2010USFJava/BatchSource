import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-pokemon-details',
  templateUrl: './pokemon-details.component.html',
  styleUrls: ['./pokemon-details.component.css']
})
export class PokemonDetailsComponent implements OnInit {
  /*@Input() is a class field decorator and it marks a class field as an input property
  and supplies configuration metadata. The input property is bound to a DOM property
  in the template. During change detection, Angular automatically updates the 
  data property with the DOM property's value.
  We need to import Input from angular/core

  Specifically, We will be getting the name and spriteUrl from the search component

*/
  @Input() name:string;
  @Input() spriteUrl:string;

  constructor() { }

  ngOnInit(): void {
  }

}
