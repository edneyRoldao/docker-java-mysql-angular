import { Component, OnInit } from '@angular/core';
import { TaskService } from './task-service';
import { Task } from './task-model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  tasks: Task[] = []

  constructor(private taskService: TaskService) {}

  ngOnInit(): void {
    this.taskService.list().subscribe(tasks => this.tasks = tasks)
  }

}
