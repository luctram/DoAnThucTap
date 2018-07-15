using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SpawnerTube : MonoBehaviour {

    [SerializeField]
    private GameObject tube;
	// Use this for initialization
	void Start () {
        StartCoroutine(Spawner());
    }
	
	IEnumerator Spawner()
    {
        yield return new WaitForSeconds(2);
        Vector3 temp = tube.transform.position;
        
        temp.y = Random.Range(-2f, 2f);

        Instantiate(tube, temp, Quaternion.identity);
        StartCoroutine(Spawner());
    }
}
