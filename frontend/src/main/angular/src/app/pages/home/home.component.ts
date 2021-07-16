import {Component, OnInit} from '@angular/core';
import {Home, HomePageService} from "../../../backend";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  homeContent?: Home;

  constructor(private readonly homePageService: HomePageService) {
  }

  ngOnInit(): void {
    this.homePageService.getHomePageData().subscribe(d => this.homeContent = d);
  }

}
