using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BirdController : MonoBehaviour {

    public static BirdController instance;
    public float flag = 0;
    public int score = 0;

    public float bounce;
    private Rigidbody2D myBody;
    private Animator anim;

    private GameObject destroySpawner;

    [SerializeField]
    private AudioSource audioSource;

    [SerializeField]
    private AudioClip flyClip, pingClip, diedClip;

    void Awake()
    {
        myBody = GetComponent<Rigidbody2D>();
        anim = GetComponent<Animator>();
        MakeInstance();
        destroySpawner = GameObject.Find("Spawner Tube");
    }
	
    void MakeInstance()
    {
        if(instance == null)
        {
            instance = this;
        }

    }
	void FixedUpdate () {
        _BirdMove();
	}

    void _BirdMove()
    {
        if (Input.GetMouseButtonDown(0) )
        {
            myBody.velocity = new Vector2(myBody.velocity.x,bounce);
            audioSource.PlayOneShot(flyClip);
        }

        if(myBody.velocity.y > 0)
        {
            float angel = 0;
            angel = Mathf.Lerp(0, 90, myBody.velocity.y / 7);
            transform.rotation = Quaternion.Euler(0, 0, angel);
        }
        else if (myBody.velocity.y == 0)
        {
            transform.rotation = Quaternion.Euler(0, 0, 0);
        }
        else if(myBody.velocity.y < 0)
        {
            float angel = 0;
            angel = Mathf.Lerp(0, -90, -myBody.velocity.y / 7);
            transform.rotation = Quaternion.Euler(0, 0, angel);
        }
    }

    void OnTriggerEnter2D(Collider2D target)
    {
        if (target.tag == "TubeEmpty")
        {
            audioSource.PlayOneShot(pingClip);
            score++;
            if(GamePlay.instance != null)
            {
                GamePlay.instance._GetScore(score);
            }
        }
    }

    void OnCollisionEnter2D(Collision2D target)
    {
        if(target.gameObject.tag == "Tube" || target.gameObject.tag == "Ground")
        {
            flag = 1;
            Destroy(destroySpawner);
            audioSource.PlayOneShot(diedClip);
            anim.SetTrigger("Died");
            if (GamePlay.instance != null)
            {
                GamePlay.instance._Died(score);
            }
        }
    }
}
