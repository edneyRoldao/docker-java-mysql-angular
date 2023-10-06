import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";

import { Task } from "./task-model";
import { environment } from "../environments/environment"

@Injectable({
    providedIn: 'root'
})
export class TaskService {

    baseURL = `${environment.backendProtocol}://${environment.backendHost}:${environment.backendPort}`

    constructor(private httpClient: HttpClient) {}

    list(): Observable<Task[]> {
        return this.httpClient.get<Task[]>(this.baseURL + '/tasks')
    }

}
