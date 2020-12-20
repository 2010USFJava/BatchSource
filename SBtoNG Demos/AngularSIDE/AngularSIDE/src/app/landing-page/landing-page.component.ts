import { Component, OnInit } from '@angular/core';
import { AjaxServiceService } from '../ajax-service.service';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent implements OnInit {

  userDetails = '';
  loginMessage = '';
  logoutMessage = '';

  constructor(private myAjax: AjaxServiceService) { }

  ngOnInit(): void {
  }

  firstButton(){

    this.myAjax.infoRequest().subscribe(

      data => {
        console.log(data);

        const ourField = 'name';
        // const ourField2 = 'admin'
        this.userDetails = this.userDetails + ' ' + data[ourField];
      }

    )
  }

  secondButton(){
    this.myAjax.loginRequest().subscribe(

      data => {
        const ourField = 'message';
        this.loginMessage = this.loginMessage + ' ' + data[ourField];
      }

    )
  }

  otherButton(){
    this.myAjax.logoutRequest().subscribe(

      data => {
        const ourField = 'message';
        //if message == false, invoke another httprequestion function
        this.logoutMessage = this.logoutMessage + ' ' + data[ourField];
      }
    )
  }

}
